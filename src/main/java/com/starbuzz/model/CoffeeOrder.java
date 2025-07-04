package com.starbuzz.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "coffee_orders")
public class CoffeeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private BigDecimal price;

    public CoffeeOrder() {}

    public CoffeeOrder(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
