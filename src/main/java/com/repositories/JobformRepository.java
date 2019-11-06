package com.repositories;


import com.entities.JobForm;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;



@Repository

public interface JobformRepository extends CrudRepository<JobForm, Long> {



}
