package com.repositories;

import com.Models.ManagersNameService;
import com.entities.Managers_name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagersNameServiceImpl implements ManagersNameService {
    private final ManagersNameRepository managersNameRepository;

    @Autowired
    public ManagersNameServiceImpl(ManagersNameRepository managersNameRepository) {
        this.managersNameRepository = managersNameRepository;
    }

    @Override
    public List<Managers_name> getAllManagers() {
        return managersNameRepository.getAllManagers();
    }
}
