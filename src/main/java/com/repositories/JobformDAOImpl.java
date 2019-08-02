package com.repositories;

import com.Models.JobformDAO;
import com.entities.JobForm;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class JobformDAOImpl implements JobformDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addJobform(JobForm jobForm) {
        sessionFactory.getCurrentSession().save(jobForm);
    }

    @SuppressWarnings("uncheked")
    public List jobFormList() {
        return sessionFactory.getCurrentSession().createQuery("from Jobform").list();
    }
    public void removeJobform (Integer id){
        JobForm jobForm = (JobForm) sessionFactory.getCurrentSession().load(JobForm.class, id);
        if (null != jobForm){
            sessionFactory.getCurrentSession().delete(jobForm);
        }
    }

}
