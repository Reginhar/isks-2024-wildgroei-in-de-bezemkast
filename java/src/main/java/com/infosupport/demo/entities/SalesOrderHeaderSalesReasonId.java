package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class SalesOrderHeaderSalesReasonId implements java.io.Serializable {
    private static final long serialVersionUID = 425731255904327643L;
    @Column(name = "SalesOrderID", nullable = false)
    private Integer salesOrderID;

    @Column(name = "SalesReasonID", nullable = false)
    private Integer salesReasonID;

    public Integer getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Integer getSalesReasonID() {
        return salesReasonID;
    }

    public void setSalesReasonID(Integer salesReasonID) {
        this.salesReasonID = salesReasonID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesOrderHeaderSalesReasonId entity = (SalesOrderHeaderSalesReasonId) o;
        return Objects.equals(this.salesOrderID, entity.salesOrderID) &&
                Objects.equals(this.salesReasonID, entity.salesReasonID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderID, salesReasonID);
    }

}