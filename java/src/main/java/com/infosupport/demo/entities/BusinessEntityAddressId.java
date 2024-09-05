package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class BusinessEntityAddressId implements java.io.Serializable {
    private static final long serialVersionUID = 8215091541305370855L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "AddressID", nullable = false)
    private Integer addressID;

    @Column(name = "AddressTypeID", nullable = false)
    private Integer addressTypeID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    public Integer getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BusinessEntityAddressId entity = (BusinessEntityAddressId) o;
        return Objects.equals(this.addressTypeID, entity.addressTypeID) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.addressID, entity.addressID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressTypeID, businessEntityID, addressID);
    }

}