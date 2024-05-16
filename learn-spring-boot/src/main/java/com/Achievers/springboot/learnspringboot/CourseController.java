package com.Achievers.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // url/courses
    // Course: id, name, trainer

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "Rahul"),
                new Course(2, "Learn Spring", "Mohit"),
                new Course(3, "Learn AWS", "Rohit"),
                new Course(4, "Learn Docker", "Vishal"));
    }
}
