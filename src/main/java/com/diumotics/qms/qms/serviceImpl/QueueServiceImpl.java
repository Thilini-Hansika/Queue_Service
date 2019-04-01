package com.diumotics.qms.qms.serviceImpl;

import com.diumotics.qms.qms.dto.QueueDto;
import com.diumotics.qms.qms.entity.Queue;
import com.diumotics.qms.qms.repository.QueueRepository;
import com.diumotics.qms.service.QueueService.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thilini Hansika on 3/13/2019.
 */
@Service
@Transactional
public class QueueServiceImpl implements QueueService{

    @Autowired
    private QueueRepository  queueRepository;
    @Override
    public boolean save(QueueDto queueDto) {
        Queue queue=queueRepository.save(new Queue(


                queueDto.getTicketno(),
                queueDto.getCounterno(),
                queueDto.getTask(),
                queueDto.getLanguage(),
                queueDto.getDate(),
                queueDto.getStatus()
        ));
        if(queue!=null){
            return true;
        }
        return false;

    }

    @Override
    public ArrayList<QueueDto> getQueueList() {
        List<Queue> queueList=queueRepository.findAll();
        ArrayList<QueueDto> allqueDtoList=new ArrayList<>();
        for (Queue  queue:queueList){
            QueueDto  queueDto=new QueueDto(

                    
            );
            queueDto.setTicketno(queue.getTicketno());
            queueDto.setCounterno(queue.getCounterno());
            queueDto.setDate(queue.getDate());
            queueDto.setLanguage(queue.getLanguage());
            queueDto.setStatus(queue.getStatus());
            queueDto.setTask(queue.getTask());
            allqueDtoList.add(queueDto);
        }
        System.out.println("Queue List =="+allqueDtoList);
        return allqueDtoList;

    }

    @Override
    public boolean deactiveQueueRecord(String id) {
        queueRepository.deleteById(id);
        System.out.println("Queue Service Deactivate"+id);
        return true;
    }
}
