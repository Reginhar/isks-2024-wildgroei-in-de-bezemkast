package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;

@Embeddable
public class SalesTerritoryHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = 6633372253427589910L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    @Column(name = "TerritoryID", nullable = false)
    private Integer territoryID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Integer getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Integer territoryID) {
        this.territoryID = territoryID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesTerritoryHistoryId entity = (SalesTerritoryHistoryId) o;
        return Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.territoryID, entity.territoryID) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, territoryID, startDate);
    }

}