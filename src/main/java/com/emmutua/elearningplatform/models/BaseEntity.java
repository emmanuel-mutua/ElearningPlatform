package com.emmutua.elearningplatform.models;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass //Means that all classes that will inherit from this class will have all the properties of the class
@Data //Getter and the setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEntity {
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private String createdBy;
    private String modifiedBy;


}
