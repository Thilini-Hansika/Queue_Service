package com.diumotics.qms.qms.controller;

import com.diumotics.qms.qms.dto.QueueDto;
import com.diumotics.qms.service.QueueService.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Thilini Hansika on 3/13/2019.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "queue")
public class QueueController{

    @Autowired
    private QueueService queueService;

    @RequestMapping(value = "/add",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveQueue(@RequestBody QueueDto queueDto){
        return queueService.save(queueDto);

    }
    @RequestMapping(method =RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<QueueDto> getAllCustomers() {
        return queueService.getQueueList();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String Name(){
        return "thilini";

    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean DeactivateRecord(@PathVariable("id") String ticketNo){
        System.out.println("Deleted   Teller=="+ticketNo);
        return queueService.deactiveQueueRecord(ticketNo);
    }

}
