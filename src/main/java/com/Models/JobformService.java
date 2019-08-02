package com.Models;

import com.entities.JobForm;

import java.util.List;

public interface JobformService {

    public void addContact(JobForm contact);

    public List<JobForm> listContact();

    public void removeContact(Integer id);

}
