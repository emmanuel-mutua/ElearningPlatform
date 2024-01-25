package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Section {
    @Id
    @GeneratedValue
    private Integer sectionId;
    private String name;
    @Column(
            name = "section_order"
    )
    private String order;

    //Many sections one course
    //Many to one.. must have the join column
    @ManyToOne
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
};
