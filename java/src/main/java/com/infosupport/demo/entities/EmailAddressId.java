package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class EmailAddressId implements java.io.Serializable {
    private static final long serialVersionUID = -5267250512034572025L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "EmailAddressID", nullable = false)
    private Integer emailAddressID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getEmailAddressID() {
        return emailAddressID;
    }

    public void setEmailAddressID(Integer emailAddressID) {
        this.emailAddressID = emailAddressID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmailAddressId entity = (EmailAddressId) o;
        return Objects.equals(this.emailAddressID, entity.emailAddressID) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddressID, businessEntityID);
    }

}