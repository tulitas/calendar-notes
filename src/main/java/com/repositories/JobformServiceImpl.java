package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobformServiceImpl implements JobformService {
    @Autowired
    private JobformRepository jobformRepository;

    @Transactional
    public void addContact(JobForm jobForm) {
        jobformRepository.save(jobForm);
        System.out.println(jobForm);


    }

    @Transactional
    public List<JobForm> listContact() {
        return jobformRepository.findAll();

    }

    @Transactional
    public JobForm removeContact(Integer id) {
        JobForm jobForm = jobformRepository.findOne(id);
        if (null != jobForm) {
            jobformRepository.delete(id);
       }
        return jobForm;
    }
}