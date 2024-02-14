package com.emmutua.elearningplatform.learning_management.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Lecture extends BaseEntity {
    @Id
    @GeneratedValue(
            generator = "lecture_id_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "lecture_id_gen"
    )
    private Integer lecturerId;
    private String name;

    @ManyToOne
    @JoinColumn(
            name = "section_id"
    )
    private Section section;

    @OneToOne
    @JoinColumn(
            name = "resource_id",
            referencedColumnName = "resourceId"
    )
    private Resources resources;
}
