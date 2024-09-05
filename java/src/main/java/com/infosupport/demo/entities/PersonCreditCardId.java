package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PersonCreditCardId implements java.io.Serializable {
    private static final long serialVersionUID = 3307221855100412053L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "CreditCardID", nullable = false)
    private Integer creditCardID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(Integer creditCardID) {
        this.creditCardID = creditCardID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonCreditCardId entity = (PersonCreditCardId) o;
        return Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.creditCardID, entity.creditCardID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, creditCardID);
    }

}