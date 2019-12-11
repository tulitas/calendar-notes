package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public  class JobformServiceImpl implements JobformService {
    @Autowired
    private JobformRepository jobformRepository;

    @Override
    @Transactional
    public void addJobForm(JobForm jobForm) {
        jobformRepository.save(jobForm);
        System.out.println(jobForm);


    }

    @Override
    @Transactional
    public List<JobForm> listJobForm() {
        return (List<JobForm>) jobformRepository.findAll();

    }

    @Override
    @Transactional
    public void removeJobForm(long id) {
        jobformRepository.deleteById(id);
    }

    @Override
    public List<JobForm> getAllByWorkdate(String work_date) {
        return jobformRepository.getAllByWorkdate(work_date);
    }

    @Override
    public String getStatistics() {
        return jobformRepository.getStatistics();
    }

    @Override
    public List<JobForm> findById(long id) {
        System.out.println("jsi");
        return jobformRepository.findById(id);
    }


}