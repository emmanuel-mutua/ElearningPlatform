package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Table(
        name = "resources",
        uniqueConstraints = @UniqueConstraint(
                name = "resource_url_unique",
                columnNames = "resource_url"
        )

)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// @DiscriminatorColumn(name = "resource_type") For single table
public class Resources{
    @Id
    @GeneratedValue
    private Integer resourceId;
    private String name;
    private Integer size;
    @Column(
            name = "resource_url",
            nullable = false
    )
    private String resourceUrl;
    @OneToOne(
            mappedBy = "resources",
            optional = false
    )
    private Lecture lecture;
}
