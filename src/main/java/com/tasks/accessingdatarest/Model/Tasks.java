package com.tasks.accessingdatarest.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "created_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "last_updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;

    @PrePersist
    protected void onCreate() {
        createdDateTime = new Date();
        lastUpdatedDateTime = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        lastUpdatedDateTime = new Date();
    }
}

