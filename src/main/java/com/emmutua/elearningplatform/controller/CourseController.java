package com.emmutua.elearningplatform.controller;

import com.emmutua.elearningplatform.models.Course;
import com.emmutua.elearningplatform.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest allows systems to communicate
 * @RestController -> Special bean to handle incoming requests/ Returns a JSON Responses
 */

@RestController
@RequestMapping("api/v1")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}
