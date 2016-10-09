package com.rawsanj.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by Sanjay on 10/9/2016.
 */
@Document
public class Company {

    @Id
    private String id;

    @Field("name")
    private String Name;

    @DBRef
    List<Job> job;

    public Company() {
    }

    public Company(String name, List<Job> job) {
        Name = name;
        this.job = job;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Job> getJob() {
        return job;
    }

    public void setJob(List<Job> job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", job=" + job +
                '}';
    }
}
