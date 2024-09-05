package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ProductInventoryId implements java.io.Serializable {
    private static final long serialVersionUID = 7762610044461143515L;
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "LocationID", nullable = false)
    private Short locationID;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Short getLocationID() {
        return locationID;
    }

    public void setLocationID(Short locationID) {
        this.locationID = locationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductInventoryId entity = (ProductInventoryId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.locationID, entity.locationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, locationID);
    }

}