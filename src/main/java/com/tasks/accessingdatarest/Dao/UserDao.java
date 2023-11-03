package com.tasks.accessingdatarest.Dao;

import com.tasks.accessingdatarest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
