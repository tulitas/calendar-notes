package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;



@Repository

public interface JobformRepository extends CrudRepository<JobForm, Long> {

}
