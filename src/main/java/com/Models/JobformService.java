package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformService {

    void addJobForm(JobForm contact);


    List<JobForm> listJobForm();

    void removeJobForm(long id);

    List<JobForm> getAllByWorkdate(String work_date);

    String getStatistics();
}
