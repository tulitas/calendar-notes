package com.repositories;

import com.entities.Managers_name;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagersNameRepository extends CrudRepository<Managers_name, Long> {
@Query(value = "SELECT count(name) from Managers_name ")
    List<Managers_name> getAllManagers();
}
