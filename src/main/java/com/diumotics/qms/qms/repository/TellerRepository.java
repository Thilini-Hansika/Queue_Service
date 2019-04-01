package com.diumotics.qms.qms.repository;

import com.diumotics.qms.qms.entity.Teller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Thilini Hansika on 3/14/2019.
 */
public interface TellerRepository extends JpaRepository<Teller,String>{

@Query(value = "    SELECT count (t.id) from Teller t" )
 int getTeller();

//@Query(value = "select userName,password from Teller")
//    boolean canAuthenticate(String userName,String  password);
    @Query(value = " select  user_name from Teller",nativeQuery = true)
    boolean existTeller(String userName);


    @Query(value = "select distinct password from teller where user_name",nativeQuery = true)
    Teller canCheck(String userName);

}

/*

 @Query(value = "SELECT count(tm.id) from Team tm")
    long getTotalTeams();

    @Query(value = "SELECT * from team",nativeQuery = true)
    ArrayList<Team> getallTems();

 */