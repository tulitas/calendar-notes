package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformDAO {

    void addJobform(JobForm jobForm);

    List<JobForm> listJobform();

    void removeJobform(Integer id);

}
