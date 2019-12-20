package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformService {

    void addJobForm(JobForm contact);

    List<JobForm> listJobForm();

    void removeJobForm(long id);

    List<JobForm> getAllByWorkdate(String work_date);

    List<JobForm> findById(long id);

    String getStatistics( String date2);


    String getRemont(String date2);

    String getSnjatie(String date2);

    String getMinibasic(String date2);

    String getMinibasicpluss(String date2);

    String getOptimum(String date2);

    String getMini(String date2);

    String getPremium(String date2);
}

