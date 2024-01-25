package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Lecture {
    @Id
    @GeneratedValue(
            generator = "lecture_id_gen",
            strategy = GenerationType.TABLE
    )
    @TableGenerator(
            name = "lecture_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            pkColumnValue = "id_value",
            allocationSize = 1
    )
    private Integer lecturerId;
    private String name;

    @ManyToOne
        @JoinColumn(
            name = "section_id",
            referencedColumnName = "sectionId"
    )
    private Section section;

    @OneToOne
    @JoinColumn(
            name = "resource_id",
            referencedColumnName = "resourceId"
    )
    private Resources resources;
}
