package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformService {

    void addJobForm(JobForm contact);

    List<JobForm> listJobForm();

    void removeJobForm(long id);

    List<JobForm> getAllByWorkdate(String workDate);

    List<JobForm> findById(long id);

    String getStatistics( String date2);


    String getRemont(String date2);

    String getSnjatie(String date2);

    String getMinibasic(String date2);

    String getMinibasicpluss(String date2);

    String getOptimum(String date2);

    String getMini(String date2);

    String getPremium(String date2);


    String getJobsperdays(String date3);


    String getRemminibasic(String date2);

    String getRemminibasicplus(String date2);

    String getRemoptimum(String date2);

    Integer getSumma(String date2);

    String getMapon(String date2);

    String getIgla(String date2);

    String getCitaiekarta(String date2);

    String getRemmini(String date2);

    String getRempremium(String date2);

    String getRemmapon(String date2);

    String getRemigla(String date2);

    String getRemcitaiekarta(String date2);




    List<String> getNotArrived(String workDate);

    List<String> getRewNextDate(String workDate);

    List<String> getPerformed(String workDate);

    List<String> getInTooday(String workDate);

    List<String> getArrived(String workDate);
}

