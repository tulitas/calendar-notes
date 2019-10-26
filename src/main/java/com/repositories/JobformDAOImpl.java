package com.repositories;

import com.Models.JobformDAO;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class JobformDAOImpl implements JobformDAO {

    @Autowired
    private JobformRepository jobformRepository;

    @Override
    public void addJobform(JobForm jobForm) {
        jobformRepository.save(jobForm);

    }

    @Override
    @SuppressWarnings("uncheked")
    public List<JobForm> listJobform() {
        return (List<JobForm>) jobformRepository.findAll();
    }



    @Override
    public void removeJobform(long id) {
        System.out.println("delete test2 DAO");
        JobForm jobForm = jobformRepository.findOne(id);
        if (null != jobForm) {
            jobformRepository.delete(jobForm);
        }


    }
}
