package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class BusinessEntityContactId implements java.io.Serializable {
    private static final long serialVersionUID = 1814408660178016220L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "PersonID", nullable = false)
    private Integer personID;

    @Column(name = "ContactTypeID", nullable = false)
    private Integer contactTypeID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public Integer getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(Integer contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BusinessEntityContactId entity = (BusinessEntityContactId) o;
        return Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.personID, entity.personID) &&
                Objects.equals(this.contactTypeID, entity.contactTypeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, personID, contactTypeID);
    }

}