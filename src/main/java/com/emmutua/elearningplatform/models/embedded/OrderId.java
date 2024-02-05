package com.emmutua.elearningplatform.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * impl serializable actually means that the class can be converted to a form that is easily be saved
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId implements Serializable {
    private String username;
    private LocalDateTime orderDate;
}
