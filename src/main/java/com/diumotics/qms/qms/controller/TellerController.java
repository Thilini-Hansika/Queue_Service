package com.diumotics.qms.qms.controller;

import com.diumotics.qms.qms.dto.TellerDto;
import com.diumotics.qms.service.QueueService.TellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Thilini Hansika on 3/14/2019.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "teller")
public class TellerController {

    @Autowired
    private TellerService tellerService;

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean SaveTeller(@RequestBody TellerDto teller) {
        return tellerService.saveTeller(teller);
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthencate(@RequestBody TellerDto tellerDto){

        System.out.println("Serviec Imple"+tellerDto);
        return tellerService.canAuthenticate(tellerDto.getUserName(),tellerDto.getPassword());
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public TellerDto getTeller(@PathVariable("id") String tellerName){
        System.out.println("get All Student  By Name");
        return tellerService.getTellerDetail(tellerName);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteTeler(@PathVariable("id") String tellerName){
        System.out.println("Deleted   Teller=="+tellerName);
        return tellerService.deleteTelller(tellerName);
    }


}
