package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ProductModelIllustrationId implements java.io.Serializable {
    private static final long serialVersionUID = 7893861977523685197L;
    @Column(name = "ProductModelID", nullable = false)
    private Integer productModelID;

    @Column(name = "IllustrationID", nullable = false)
    private Integer illustrationID;

    public Integer getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(Integer productModelID) {
        this.productModelID = productModelID;
    }

    public Integer getIllustrationID() {
        return illustrationID;
    }

    public void setIllustrationID(Integer illustrationID) {
        this.illustrationID = illustrationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductModelIllustrationId entity = (ProductModelIllustrationId) o;
        return Objects.equals(this.productModelID, entity.productModelID) &&
                Objects.equals(this.illustrationID, entity.illustrationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productModelID, illustrationID);
    }

}