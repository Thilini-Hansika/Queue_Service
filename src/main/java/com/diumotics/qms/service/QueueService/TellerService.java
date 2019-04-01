package com.diumotics.qms.service.QueueService;

import com.diumotics.qms.qms.dto.TellerDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Thilini Hansika on 3/14/2019.
 */

public interface TellerService {
    public boolean saveTeller(TellerDto tellerDto);
    boolean canAuthenticate(String username, String password);
    public  TellerDto  getTellerDetail(String  tellerName);
    public boolean deleteTelller(String  tellerName);
}
