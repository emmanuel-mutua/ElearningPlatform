package com.emmutua.elearningplatform.models;

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
public class Lecture extends BaseEntity{
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
