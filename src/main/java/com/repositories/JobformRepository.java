package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface JobformRepository extends CrudRepository <JobForm, Long> {

    //    @Query("select b from JobForm b where b.manager = Agnese")
//    JobForm findByManager(@Param("manager") String manager);



    @Query(value = "select manager from jobform where manager = 'Agnese'", nativeQuery = true)
    List<JobForm> getAllByManager();

}