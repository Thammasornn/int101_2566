package com.example.demo.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PaymentId implements java.io.Serializable {
    private static final long serialVersionUID = 3161957106634470406L;
}