package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ProductProductPhotoId implements java.io.Serializable {
    private static final long serialVersionUID = -83343038218793096L;
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "ProductPhotoID", nullable = false)
    private Integer productPhotoID;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductPhotoID() {
        return productPhotoID;
    }

    public void setProductPhotoID(Integer productPhotoID) {
        this.productPhotoID = productPhotoID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductProductPhotoId entity = (ProductProductPhotoId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.productPhotoID, entity.productPhotoID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productPhotoID);
    }

}