package com.emmutua.elearningplatform.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(
        name = "resources",
        uniqueConstraints = @UniqueConstraint(
                name = "resource_url_unique",
                columnNames = "resource_url"
        )

)
public class Resources {
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
    private ResourceType resourceType;

    @OneToOne(
            mappedBy = "resources",
            optional = false
    )
    private Lecture lecture;
}
