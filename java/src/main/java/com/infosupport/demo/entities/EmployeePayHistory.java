package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "EmployeePayHistory", schema = "HumanResources")
public class EmployeePayHistory {
    @EmbeddedId
    private EmployeePayHistoryId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private Employee businessEntityID;

    @Column(name = "Rate", nullable = false)
    private BigDecimal rate;

    @Column(name = "PayFrequency", columnDefinition = "tinyint not null")
    private Short payFrequency;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public EmployeePayHistoryId getId() {
        return id;
    }

    public void setId(EmployeePayHistoryId id) {
        this.id = id;
    }

    public Employee getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Employee businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Short getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(Short payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}