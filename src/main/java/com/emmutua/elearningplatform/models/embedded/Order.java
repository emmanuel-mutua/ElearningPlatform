package com.emmutua.elearningplatform.models.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_order")
public class Order {
    @EmbeddedId
    private OrderId orderId;
    private String orderInfo;
    @Embedded
    private Address address;
}
