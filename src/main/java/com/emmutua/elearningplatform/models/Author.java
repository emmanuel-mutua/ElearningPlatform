package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Table(
        name = "AUTHOR_TBL"
)
public class Author extends BaseEntity {
    @Id //specify how ids will be generated
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence", //Name of the database obj where to obtain the primary keys
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
    // private Set<Course> courseSet = new HashSet<>();
}

/**
 * Can create your own sq and add own allocation size
 */