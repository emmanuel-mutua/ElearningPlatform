package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course extends BaseEntity {
    @Id
    @GeneratedValue
    private Integer courseId;
    private String title;
    private String description;

    //Owner
    @ManyToMany(
            //Pass permissions to child elem to allow save a course
            cascade = CascadeType.ALL //You have the privellege to add a new auther
    )
    @JoinTable(
            name = "course_author_mapping",
            joinColumns = @JoinColumn(name = "course_id",
                    referencedColumnName = "courseId"),
            inverseJoinColumns = @JoinColumn(name = "author_id",
                    referencedColumnName = "authorId"))
    List<Author> authors;

    //One course many sections
    //one to many say mapped by
    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}
