package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "Location", schema = "Production")
public class Location {
    @Id
    @Column(name = "LocationID", nullable = false)
    private Short id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @ColumnDefault("0.00")
    @Column(name = "CostRate", nullable = false)
    private BigDecimal costRate;

    @ColumnDefault("0.00")
    @Column(name = "Availability", nullable = false, precision = 8, scale = 2)
    private BigDecimal availability;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCostRate() {
        return costRate;
    }

    public void setCostRate(BigDecimal costRate) {
        this.costRate = costRate;
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    public void setAvailability(BigDecimal availability) {
        this.availability = availability;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}