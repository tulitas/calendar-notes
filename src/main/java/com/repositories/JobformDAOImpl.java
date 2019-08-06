package com.repositories;

import com.Models.JobformDAO;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobformDAOImpl implements JobformDAO {

    @Autowired
    private JobformRepository jobformRepository;

    public void addJobform(JobForm jobForm) {
        jobformRepository.save(jobForm);

    }

    @Override
    @SuppressWarnings("uncheked")
    public List<JobForm> listJobform() {
        return jobformRepository.findAll();
    }

    public void removeJobform(Integer id) {
        JobForm jobForm = jobformRepository.findOne(id);
        if (null != jobForm) {
            jobformRepository.delete(jobForm);
        }

    }


}
