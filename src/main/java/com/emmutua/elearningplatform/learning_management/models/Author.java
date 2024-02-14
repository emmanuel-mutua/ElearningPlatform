package com.emmutua.elearningplatform.learning_management.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Author extends BaseEntity {
    @Id
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    private Integer authorId;
    private String firstname;
    private String lastname;

    @Column(
            name = "email_address",
            nullable = false,
            unique = true
    )
    private String email;
    private String age;

    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> courses;

    public void addCourses(Course course){
        if (courses == null) courses = new ArrayList<>();
        courses.add(course);
    }
}
