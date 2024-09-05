package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PersonPhoneId implements java.io.Serializable {
    private static final long serialVersionUID = 1122606073807659695L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "PhoneNumber", columnDefinition = "Phone not null")
    private Object phoneNumber;

    @Column(name = "PhoneNumberTypeID", nullable = false)
    private Integer phoneNumberTypeID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Object getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPhoneNumberTypeID() {
        return phoneNumberTypeID;
    }

    public void setPhoneNumberTypeID(Integer phoneNumberTypeID) {
        this.phoneNumberTypeID = phoneNumberTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonPhoneId entity = (PersonPhoneId) o;
        return Objects.equals(this.phoneNumber, entity.phoneNumber) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.phoneNumberTypeID, entity.phoneNumberTypeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, businessEntityID, phoneNumberTypeID);
    }

}