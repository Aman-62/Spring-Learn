package com.achievers.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String name;
    private String trainer;

    public Course() {
    }

    public Course(long id, String name, String trainer) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
    }

}
