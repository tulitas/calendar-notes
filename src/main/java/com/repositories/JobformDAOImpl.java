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

  private final JobformRepository jobformRepository;

  @Autowired
  public JobformDAOImpl(JobformRepository jobformRepository) {
    this.jobformRepository = jobformRepository;
  }

  @Override
  public void addJobform(JobForm jobForm) {
    jobformRepository.save(jobForm);

  }

  @Override
  public List<JobForm> listJobform() {
    return (List<JobForm>) jobformRepository.findAll();
  }

  @Override
  public void deleteJobform(long id) {
    jobformRepository.deleteById(id);
  }

  @Override
  public List<JobForm> getAllByWorkdate(String work_date) {
    return (List<JobForm>) jobformRepository.findAll();
  }



}
