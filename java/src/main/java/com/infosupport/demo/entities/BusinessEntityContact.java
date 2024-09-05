package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "BusinessEntityContact", schema = "Person")
public class BusinessEntityContact {
    @EmbeddedId
    private BusinessEntityContactId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private BusinessEntity businessEntityID;

    @MapsId("personID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PersonID", nullable = false)
    private com.infosupport.demo.entities.Person personID;

    @MapsId("contactTypeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ContactTypeID", nullable = false)
    private com.infosupport.demo.entities.ContactType contactTypeID;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public BusinessEntityContactId getId() {
        return id;
    }

    public void setId(BusinessEntityContactId id) {
        this.id = id;
    }

    public BusinessEntity getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(BusinessEntity businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public com.infosupport.demo.entities.Person getPersonID() {
        return personID;
    }

    public void setPersonID(com.infosupport.demo.entities.Person personID) {
        this.personID = personID;
    }

    public com.infosupport.demo.entities.ContactType getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(com.infosupport.demo.entities.ContactType contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    public UUID getRowguid() {
        return rowguid;
    }

    public void setRowguid(UUID rowguid) {
        this.rowguid = rowguid;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}