package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Nationalized;

import java.util.Objects;

@Embeddable
public class ProductModelProductDescriptionCultureId implements java.io.Serializable {
    private static final long serialVersionUID = -7671964669684479479L;
    @Column(name = "ProductModelID", nullable = false)
    private Integer productModelID;

    @Column(name = "ProductDescriptionID", nullable = false)
    private Integer productDescriptionID;

    @Nationalized
    @Column(name = "CultureID", nullable = false, length = 6)
    private String cultureID;

    public Integer getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(Integer productModelID) {
        this.productModelID = productModelID;
    }

    public Integer getProductDescriptionID() {
        return productDescriptionID;
    }

    public void setProductDescriptionID(Integer productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public String getCultureID() {
        return cultureID;
    }

    public void setCultureID(String cultureID) {
        this.cultureID = cultureID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductModelProductDescriptionCultureId entity = (ProductModelProductDescriptionCultureId) o;
        return Objects.equals(this.cultureID, entity.cultureID) &&
                Objects.equals(this.productDescriptionID, entity.productDescriptionID) &&
                Objects.equals(this.productModelID, entity.productModelID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cultureID, productDescriptionID, productModelID);
    }

}