package com.emmutua.elearningplatform.controller;

import com.emmutua.elearningplatform.models.Author;
import com.emmutua.elearningplatform.models.Course;
import com.emmutua.elearningplatform.models.Resources;
import com.emmutua.elearningplatform.repositories.AuthorRepository;
import com.emmutua.elearningplatform.repositories.CourseRepository;
import com.emmutua.elearningplatform.repositories.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://cloud.uipath.com")
@RestController
@RequestMapping("api/v1")
public class ELearnPlatform {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private ResourceRepository resourceRepository;


    @GetMapping("/authors")
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
    @GetMapping("/authors/{name}")
    public List<Author> getAuthorByFirstName(@PathVariable String name) {
        return authorRepository.findAllByFirstnameIgnoreCharacterArrangement(name);
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{title}")
    public Optional<Course> findByCourseTitle(@PathVariable String title){
        return courseRepository.findByCourseTitle(title);
    }
    @GetMapping("/resources")
    public List<Resources> getAllResources(){
        return resourceRepository.findAll();
    }

}
