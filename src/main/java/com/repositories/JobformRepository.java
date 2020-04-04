package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface JobformRepository extends CrudRepository<JobForm, Long> {

    List<JobForm> getAllByWorkdate(String workDate);

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

    @Query(value = "SELECT sum(price) FROM jobform where work = 'montaz' and work_date like %:date2%",
            nativeQuery = true)
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


    @Query(value = "SELECT count(work) from jobform where work_date = :workDate and action is null", nativeQuery = true)
    List<String> getNotArrived(String workDate);

    @Query(value = "SELECT count(work) from jobform where work_date = :workDate and action = 'parrakstijas'", nativeQuery = true)
    List<String> getRewNextDate(String workDate);

    @Query(value = "select count(work) from jobform where work_date = :workDate and action = 'nodots'", nativeQuery = true)
    List<String> getPerformed(String workDate);

    @Query(value = "select count(work) from jobform where work_date = :workDate", nativeQuery = true)
    List<String> getInDay(String workDate);

    @Query(value = "select count(work) from jobform where work_date = :workDate and action = 'atbrauca'", nativeQuery = true)
    List<String> getArrived(String workDate);

    @Query(value = "SELECT count(work) from jobform where work = 'upgrade' and work_date like %:date2%", nativeQuery = true)
    String getUpgrades(String date2);

    @Query(value = "SELECT phone from jobform where id = :id" , nativeQuery = true)
    String getByIdOnly(long id);

    @Query(value = "SELECT count(work) from jobform where work = 'downgrade' and work_date like %:date2%", nativeQuery = true)
    String getDowngrades(String date2);

    @Query(value = "SELECT count(work) from jobform where work = 'pielikt gm' and work_date like %:date2%", nativeQuery = true)
    String getaddGm(String date2);

    @Query(value = "SELECT count(work) from jobform where work = 'akb maina' and work_date like %:date2%", nativeQuery = true)
    String getakbCange(String date2);

    @Query(value = "SELECT count(work) from jobform where work = 'cita darbiba' and work_date like %:date2%", nativeQuery = true)
    String getEnotherWork(String date2);
}