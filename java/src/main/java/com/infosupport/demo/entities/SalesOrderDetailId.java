package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class SalesOrderDetailId implements java.io.Serializable {
    private static final long serialVersionUID = -2806402577614846640L;
    @Column(name = "SalesOrderID", nullable = false)
    private Integer salesOrderID;

    @Column(name = "SalesOrderDetailID", nullable = false)
    private Integer salesOrderDetailID;

    public Integer getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Integer getSalesOrderDetailID() {
        return salesOrderDetailID;
    }

    public void setSalesOrderDetailID(Integer salesOrderDetailID) {
        this.salesOrderDetailID = salesOrderDetailID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesOrderDetailId entity = (SalesOrderDetailId) o;
        return Objects.equals(this.salesOrderID, entity.salesOrderID) &&
                Objects.equals(this.salesOrderDetailID, entity.salesOrderDetailID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderID, salesOrderDetailID);
    }

}