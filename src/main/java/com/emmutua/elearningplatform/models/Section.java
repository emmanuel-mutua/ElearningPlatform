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

//    @OneToMany(mappedBy = "section")
//    private List<Lecture> lectures;
};
