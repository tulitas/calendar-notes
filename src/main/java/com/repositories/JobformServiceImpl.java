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
    public List<JobForm> findById(long id) {
        System.out.println("jsi");
        return jobformRepository.findById(id);
    }

    @Override
    public String getStatistics( String date2) {
        return jobformRepository.getStatistics( date2);

    }

    @Override
    public String getRemont(String date2) {
        return jobformRepository.getRemont(date2);
    }

    @Override
    public String getSnjatie(String date2) {
        return jobformRepository.getSnjatie(date2);
    }

    @Override
    public String getMinibasic(String date2) {
        return jobformRepository.getMinibasic(date2);
    }

    @Override
    public String getMinibasicpluss(String date2) {
        return jobformRepository.getMinibasicplus(date2);
    }

    @Override
    public String getOptimum(String date2) {
        return jobformRepository.getOptimum(date2);
    }

    @Override
    public String getMini(String date2) {
        return jobformRepository.getMini(date2);
    }

    @Override
    public String getPremium(String date2) {
        return jobformRepository.getPremium(date2);
    }


}