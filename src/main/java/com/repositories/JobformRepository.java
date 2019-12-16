package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface JobformRepository extends CrudRepository<JobForm, Long> {

    //    @Query("select b from JobForm b where b.manager = Agnese")
//    JobForm findByManager(@Param("manager") String manager);


    //    @Query(value = "select id, car, client, create_date, info, manager, sistem, work, work_date " +
//            "from jobform where work_date like '2019-11-13'", nativeQuery = true)
    List<JobForm> getAllByWorkdate(String work_date);

//    @Query(value = "select work_date from jobform where work_date like '%2019-11%'", nativeQuery = true)
//    Integer getSatistics();

   @Query(value = "SELECT count(work) FROM jobform where work = 'Montaz' ", nativeQuery = true)
    String getStatistics();

    List<JobForm> findById(long id);


}