package com.diumotics.qms.qms.serviceImpl;

import com.diumotics.qms.qms.dto.TellerDto;
import com.diumotics.qms.qms.entity.Teller;
import com.diumotics.qms.qms.repository.TellerRepository;
import com.diumotics.qms.service.QueueService.TellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Thilini Hansika on 3/14/2019.
 */
@Service
@Transactional
public class TellerServiceImpl implements TellerService {
    @Autowired
    private TellerRepository  tellerRepository;

    @Override
    public boolean saveTeller(TellerDto tellerDto) {
        Teller teller=tellerRepository.save(new Teller(
//                tellerDto.getLid(),
                tellerDto.getUserName(),
                tellerDto.getBrancName(),
                tellerDto.getLanguage(),
                tellerDto.getEmail(),
                tellerDto.getContactNo(),
                tellerDto.getPassword(),
                tellerDto.getAddress(),
                tellerDto.getDate()

        ));

        if (teller  !=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean canAuthenticate(String username, String password) {
        boolean exists=tellerRepository.existsById(username);

        if(!exists){

            return false;
        }
        System.out.println("Serviec Imple"+username+password);
        Teller teller=tellerRepository.findById(username).get();
//        System.out.println("Serviec Imple"+username+password);
        return teller.getPassword().equals(password);
    }

    @Override
    public TellerDto getTellerDetail(String tellerName) {
        Teller teller=tellerRepository.findById(tellerName).get();

        TellerDto  tellerDto=new TellerDto();

        tellerDto.setUserName(teller.getUserName());
        tellerDto.setBrancName(teller.getBrancName());
        tellerDto.setLanguage(teller.getLanguage());
        tellerDto.setEmail(teller.getEmail());
        tellerDto.setContactNo(teller.getContactNo());
        tellerDto.setPassword(teller.getPassword());
        tellerDto.setAddress(teller.getAddress());
        tellerDto.setDate(teller.getDate());
        System.out.println("Get Teller :" +tellerDto
        );
        return tellerDto;


    }

    @Override
    public boolean deleteTelller(String tellerName) {
       tellerRepository.deleteById(tellerName);
        System.out.println("Teller  Service delete"+tellerName);
       return true;

    }
}
