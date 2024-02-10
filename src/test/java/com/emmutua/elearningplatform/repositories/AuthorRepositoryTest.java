package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Author;
import com.emmutua.elearningplatform.models.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class AuthorRepositoryTest {
    @Autowired
    AuthorRepository repository;

    @Test
    public void saveNewAuthor(){
        Course course = Course.builder()
                .title("Spring Data")
                .description("A deep dive into spring data JPA")
                .build();
        Author author = Author.builder()
                .firstname("John2")
                .lastname("Doe2")
                .email("emmamulwdda20@gmail.com")
                .age("30")
                .build();
        author.addCourses(course);
        repository.save(author);
    }

}