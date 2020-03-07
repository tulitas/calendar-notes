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

    @Query(value = "SELECT count(work) FROM jobform where work = 'montaz' and  action = 'Nodots' and work_date like %:date2%", nativeQuery = true)
    String getStatistics(String date2);

    @Query(value = "SELECT count(work) FROM jobform where work = 'remont' and  action = 'Nodots' and work_date like %:date2%", nativeQuery = true)
    String getRemont(String date2);

    @Query(value = "SELECT count(work) FROM jobform where work = 'snjatie' and  action = 'Nodots' and work_date like %:date2%", nativeQuery = true)
    String getSnjatie(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasic' " +
            "and  action = 'Nodots' and work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getMinibasic(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasicpluss'" +
            " and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getMinibasicplus(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'optimum'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getOptimum(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'mini'" +
            " and  action = 'Nodots' and work = 'montaz' and work_date like %:date2%", nativeQuery = true)
    String getMini(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'premium' " +
            "and action = 'Nodots' and work = 'montaz' and work_date like %:date2%", nativeQuery = true)
    String getPremium(String date2);


    @Query(value = "SELECT count(work) FROM jobform where work is not null and work_date = :date3 ", nativeQuery = true)
    String getJobsperdays(String date3);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasic'" +
            " and action = 'Nodots' and work = 'remont' and work_date like %:date2%", nativeQuery = true)
    String getRemminibasic(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasicplus'" +
            " and action = 'Nodots' and work = 'remont' and work_date like %:date2%", nativeQuery = true)
    String getRemminibasicplus(String date2);


    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'minibasicplus'" +
            " and action = 'Nodots' and work = 'remont' and work_date like %:date2%", nativeQuery = true)
    String getRemoptimum(String date2);

    @Query(value = "SELECT sum(price) FROM jobform where work = 'montaz' and work_date like %:date2%", nativeQuery = true)
    Integer getSumma(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'mapon'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getMapon(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'igla'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getIgla(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'citaiekarta'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getCitaiekarta(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'mini'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getRemmini(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'premium'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getRempremium(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'mapon'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getRemmapon(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'igla'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getRemigla(String date2);

    @Query(value = "SELECT count(sistem) FROM jobform where sistem = 'citaiekarta'" +
            "and  action = 'Nodots' and  work = 'montaz'and work_date like %:date2%", nativeQuery = true)
    String getRemcitaiekarta(String date2);
}