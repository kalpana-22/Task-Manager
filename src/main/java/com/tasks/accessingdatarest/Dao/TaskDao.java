package com.tasks.accessingdatarest.Dao;

import ch.qos.logback.core.status.Status;
import com.tasks.accessingdatarest.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao extends JpaRepository<Tasks, Integer> {

    List<Tasks> findByStatus(com.tasks.accessingdatarest.Model.Status status);

    List<Tasks> findByUserId(int userId);

    Tasks findByIdAndAndStatus(int id, com.tasks.accessingdatarest.Model.Status status);
}


