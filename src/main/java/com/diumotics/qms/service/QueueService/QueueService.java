package com.diumotics.qms.service.QueueService;

import com.diumotics.qms.qms.dto.QueueDto;
import com.diumotics.qms.qms.dto.TellerDto;

import java.util.ArrayList;

/**
 * Created by Thilini Hansika on 3/13/2019.
 */
public interface QueueService {
    public boolean save(QueueDto queueDto);
    public ArrayList<QueueDto> getQueueList();
    public boolean deactiveQueueRecord(String id);

}
