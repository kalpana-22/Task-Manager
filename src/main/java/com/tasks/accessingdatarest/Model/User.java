package com.tasks.accessingdatarest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "users")
public class User {
    @Id
    private int id;
    private String userName;
    private String password;
}
