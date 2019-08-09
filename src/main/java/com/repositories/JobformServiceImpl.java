package com.repositories;

import com.Models.JobformDAO;
import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
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
        System.out.println("hi 3");
        System.out.println(jobformRepository.findAll());
        return jobformRepository.findAll();

    }

    @Transactional
    public void removeContact(Integer id) {
        System.out.println("hi 4");
        JobForm jobForm = jobformRepository.findOne(id);
        if (null != jobForm) {
            jobformRepository.delete(id);
        }
    }
}
