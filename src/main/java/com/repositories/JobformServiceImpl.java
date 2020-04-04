package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobformServiceImpl implements JobformService {
    private final JobformRepository jobformRepository;

    @Autowired
    public JobformServiceImpl(JobformRepository jobformRepository) {
        this.jobformRepository = jobformRepository;
    }


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
    public List<JobForm> getAllByWorkdate(String workDate) {
        return jobformRepository.getAllByWorkdate(workDate);
    }

    @Override
    public List<JobForm> findById(long id) {
        return jobformRepository.findById(id);
    }

    @Override
    public String getStatistics(String date2) {
        return jobformRepository.getStatistics(date2);

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


    @Override
    public List<String> getNotArrived(String workDate) {
        return jobformRepository.getNotArrived(workDate);
    }

    @Override
    public List<String> getRewNextDate(String workDate) {
        return jobformRepository.getRewNextDate(workDate);
    }

    @Override
    public List<String> getPerformed(String workDate) {
        return jobformRepository.getPerformed(workDate);
    }

    @Override
    public List<String> getInTooday(String workDate) {
        return jobformRepository.getInDay(workDate);
    }

    @Override
    public List<String> getArrived(String workDate) {
        return jobformRepository.getArrived(workDate);
    }

    @Override
    public String getUpgrades(String date2) {
        return jobformRepository.getUpgrades(date2);
    }

    @Override
    public String findByIdOnlyPhone(long id) {
        return jobformRepository.getByIdOnlyPhone(id);
    }

    @Override
    public String getDowngrades(String date2) {
        return jobformRepository.getDowngrades(date2);

    }

    @Override
    public String getAddGm(String date2) {

        return jobformRepository.getaddGm(date2);
    }

    @Override
    public String getAkbChange(String date2) {
        return jobformRepository.getakbCange(date2);
    }

    @Override
    public String getEnotherWork(String date2) {
        return jobformRepository.getEnotherWork(date2);
    }

    @Override
    public String findByIdOnlyName(long id) {
        return jobformRepository.getByIdOnlyName(id);
    }

    @Override
    public String findByIdOnlyCar(long id) {
        return jobformRepository.getByIdOnlyCar(id);
    }


}