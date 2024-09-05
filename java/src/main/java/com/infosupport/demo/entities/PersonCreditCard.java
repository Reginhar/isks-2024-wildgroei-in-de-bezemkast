package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "PersonCreditCard", schema = "Sales")
public class PersonCreditCard {
    @EmbeddedId
    private PersonCreditCardId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private Person businessEntityID;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public PersonCreditCardId getId() {
        return id;
    }

    public void setId(PersonCreditCardId id) {
        this.id = id;
    }

    public Person getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Person businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}