package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Integer courseId;
    private Integer title;
    private Integer description;

//    @OneToMany
//    @JoinColumn(
//            name = "section_id",
//            referencedColumnName = "sectionId"
//    )
//    private List<Section> sections;

    @ManyToMany(
            //Pass permissions to child elem to allow save a course
            cascade = CascadeType.ALL //You have the privellege to add a new auther
    )
    @JoinTable(
            name = "course_author_mapping",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "authorId")
    )
    List<Author> authors;
}
