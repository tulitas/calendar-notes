package com.Models;

import com.entities.Managers_name;

import java.util.List;

public interface ManagersNameDAO {
    public void addManagerName();

    public List<Managers_name> listManagersName();

    public void deleteManagersName(long id);



}
