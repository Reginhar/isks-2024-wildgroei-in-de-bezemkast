package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ProductVendorId implements java.io.Serializable {
    private static final long serialVersionUID = -3222683395669485522L;
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductVendorId entity = (ProductVendorId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, businessEntityID);
    }

}