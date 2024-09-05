package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;

@Embeddable
public class EmployeePayHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = -3575005049876578984L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "RateChangeDate", nullable = false)
    private Instant rateChangeDate;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Instant getRateChangeDate() {
        return rateChangeDate;
    }

    public void setRateChangeDate(Instant rateChangeDate) {
        this.rateChangeDate = rateChangeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeePayHistoryId entity = (EmployeePayHistoryId) o;
        return Objects.equals(this.rateChangeDate, entity.rateChangeDate) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateChangeDate, businessEntityID);
    }

}