package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformDAO {

   public void addJobform(JobForm jobForm);

    List<JobForm> listJobform();

   public void removeJobform(Integer id);

}
