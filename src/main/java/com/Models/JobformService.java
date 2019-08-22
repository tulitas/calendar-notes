package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformService {

    void addContact(JobForm contact);

    List<JobForm> listContact();

    JobForm removeContact(Integer id);

}
