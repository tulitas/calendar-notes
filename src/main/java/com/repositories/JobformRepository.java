package com.repositories;

//import com.entities.Review;

import com.entities.JobForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface JobformRepository extends JpaRepository<JobForm, Integer> {
}
