package com.achievers.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.achievers.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1, "Learn JDBC new", "Rahul"));
        repository.save(new Course(2, "Learn JPA new", "Vishal"));
        repository.save(new Course(3, "Learn MySql new", "Rahul"));

        repository.deleteById(1l);

        // System.out.println(repository.findById(2l));
        // System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByTrainer("Vishal"));
    }
}
