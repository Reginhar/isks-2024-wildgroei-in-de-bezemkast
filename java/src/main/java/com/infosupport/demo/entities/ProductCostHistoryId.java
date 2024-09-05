package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;

@Embeddable
public class ProductCostHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = -5910942163476763780L;
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductCostHistoryId entity = (ProductCostHistoryId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, startDate);
    }

}