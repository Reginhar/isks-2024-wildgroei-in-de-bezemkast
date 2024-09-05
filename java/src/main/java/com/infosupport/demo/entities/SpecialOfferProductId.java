package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class SpecialOfferProductId implements java.io.Serializable {
    private static final long serialVersionUID = 3781466232341308316L;
    @Column(name = "SpecialOfferID", nullable = false)
    private Integer specialOfferID;

    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    public Integer getSpecialOfferID() {
        return specialOfferID;
    }

    public void setSpecialOfferID(Integer specialOfferID) {
        this.specialOfferID = specialOfferID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialOfferProductId entity = (SpecialOfferProductId) o;
        return Objects.equals(this.specialOfferID, entity.specialOfferID) &&
                Objects.equals(this.productID, entity.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialOfferID, productID);
    }

}