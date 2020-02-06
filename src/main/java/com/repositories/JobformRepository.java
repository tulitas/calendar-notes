package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface JobformRepository extends CrudRepository<JobForm, Long> {
    List<JobForm> getAllByWorkdate(String work_date);

    List<JobForm> findById(long id);

    @Query(value = "SELECT count(work) FROM jobform where work = 'montaz' and  action = 'ja' and work_date like %:date2%", nativeQuery = true)
    String getStatistics(String date2);

    @Query(value = "SELECT count(work) FROM jobform where work = 'remont' and  action = 'ja' and work_date like %:date2%", nativeQuery = true)
    String getRemont(String date2);

    @Query(value = "SELECT count(work) FROM jobform where work = 'snjatie' and  action = 'ja' and work_date like %:date2%", nativeQuery = true)
    String getSnjatie(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasic' " +
            "and  action = 'ja' and work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getMinibasic(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasicpluss'" +
            " and  action = 'ja' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getMinibasicplus(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'optimum'" +
            "and  action = 'ja' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getOptimum(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'mini'" +
            " and  action = 'ja' and work = 'montaz' and work_date like %:date2%", nativeQuery = true)
    String getMini(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'premium' " +
            "and action = 'ja' and work = 'montaz' and work_date like %:date2%", nativeQuery = true)
    String getPremium(String date2);


    @Query(value = "SELECT count(work) FROM jobform where work is not null and work_date = :date3 ", nativeQuery = true)
    String getJobsperdays(String date3);
}