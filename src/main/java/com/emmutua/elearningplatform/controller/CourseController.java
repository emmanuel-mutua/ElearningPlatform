package com.emmutua.elearningplatform.controller;

import com.emmutua.elearningplatform.models.Course;
import com.emmutua.elearningplatform.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Rest allows systems to communicate
 * @RestController -> Special bean to handle incoming requests/ Returns a JSON Responses
 */

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    @Autowired
    private static CourseRepository courseRepository;
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @PostMapping("/course")
    Course newCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @PutMapping("/course/{id}")
    Course replaceCourse(@RequestBody Course course, @PathVariable Integer id){
        if (!courseRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "USER NOT FOUND");
        }
        return courseRepository.save(course);
    }

    @DeleteMapping("/course/{id}")
    void deleteCourse(@PathVariable Integer id){
        courseRepository.deleteById(id);
    }
}
