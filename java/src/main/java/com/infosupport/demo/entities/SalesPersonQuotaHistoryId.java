package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;

@Embeddable
public class SalesPersonQuotaHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = -4719056715996317364L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "QuotaDate", nullable = false)
    private Instant quotaDate;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Instant getQuotaDate() {
        return quotaDate;
    }

    public void setQuotaDate(Instant quotaDate) {
        this.quotaDate = quotaDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesPersonQuotaHistoryId entity = (SalesPersonQuotaHistoryId) o;
        return Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.quotaDate, entity.quotaDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, quotaDate);
    }

}