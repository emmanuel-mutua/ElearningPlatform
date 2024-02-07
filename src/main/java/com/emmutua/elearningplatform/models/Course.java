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
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "course_author_mapping",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")})
    List<Author> authors;
    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}
