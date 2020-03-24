package com.repositories;

import com.Models.ManagersNameDAO;
import com.entities.JobForm;
import com.entities.Managers_name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ManagersNameDAOImpl implements ManagersNameDAO {

    private final ManagersNameRepository managersNameRepository;

    @Autowired
    public ManagersNameDAOImpl(ManagersNameRepository managersNameRepository) {
        this.managersNameRepository = managersNameRepository;
    }

    @Override
    public void addManagerName() {

    }

    @Override
    public List<Managers_name> listManagersName() {
        return (List<Managers_name>) managersNameRepository.findAll();
    }

    @Override
    public void deleteManagersName(long id) {

    }
}
