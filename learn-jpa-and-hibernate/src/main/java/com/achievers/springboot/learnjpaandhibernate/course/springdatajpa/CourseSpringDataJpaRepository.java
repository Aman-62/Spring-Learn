package com.achievers.springboot.learnjpaandhibernate.course.springdatajpa;

import com.achievers.springboot.learnjpaandhibernate.course.Course;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByTrainer(String trainer);
}