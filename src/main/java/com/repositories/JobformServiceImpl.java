package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import com.entities.Managers_name;
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

    @Override
    public String getJobsperdays(String date3) {
        return jobformRepository.getJobsperdays(date3);
    }

    @Override
    public String getRemminibasic(String date2) {
        return jobformRepository.getRemminibasic(date2);
    }

    @Override
    public String getRemminibasicplus(String date2) {
        return jobformRepository.getRemminibasicplus(date2);
    }

    @Override
    public String getRemoptimum(String date2) {

        return jobformRepository.getRemoptimum(date2);
    }

    @Override
    public Integer getSumma(String date2) {
        return jobformRepository.getSumma(date2);
    }

    @Override
    public String getMapon(String date2) {
        return jobformRepository.getMapon(date2);
    }

    @Override
    public String getIgla(String date2) {
        return jobformRepository.getIgla(date2);
    }

    @Override
    public String getCitaiekarta(String date2) {
        return jobformRepository.getCitaiekarta(date2);
    }

    @Override
    public String getRemmini(String date2) {

        return jobformRepository.getRemmini(date2);
    }

    @Override
    public String getRempremium(String date2) {
        return jobformRepository.getRempremium(date2);
    }

    @Override
    public String getRemmapon(String date2) {
        return jobformRepository.getRemmapon(date2);
    }

    @Override
    public String getRemigla(String date2) {
        return jobformRepository.getRemigla(date2);
    }

    @Override
    public String getRemcitaiekarta(String date2) {

        return jobformRepository.getRemcitaiekarta(date2);
    }




}