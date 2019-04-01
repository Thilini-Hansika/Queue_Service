package com.diumotics.qms.qms.repository;

import com.diumotics.qms.qms.entity.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Thilini Hansika on 3/13/2019.
 */
public interface QueueRepository extends JpaRepository<Queue,String> {
}
