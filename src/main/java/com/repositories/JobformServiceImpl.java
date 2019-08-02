package com.repositories;

import com.Models.JobformDAO;
import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class JobformServiceImpl implements JobformService {
    @Autowired
    private JobformDAO jobformDAO;

    @Transactional
    public void addJobform(JobForm jobForm) {
        jobformDAO.addJobform(jobForm);
        System.out.println("hi 2");
    }

    @Transactional
    public List<JobForm> jobFormList(){
        System.out.println("hi 3");
        return jobformDAO.listJobform();

    }

    @Transactional
    public void removeJobform(Integer id){
        jobformDAO.removeJobform(id);
    }
}
