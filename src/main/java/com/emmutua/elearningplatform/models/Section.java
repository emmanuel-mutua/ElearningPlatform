package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Section extends BaseEntity {
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
