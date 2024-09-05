package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "BusinessEntityAddress", schema = "Person")
public class BusinessEntityAddress {
    @EmbeddedId
    private BusinessEntityAddressId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private BusinessEntity businessEntityID;

    @MapsId("addressID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AddressID", nullable = false)
    private Address addressID;

    @MapsId("addressTypeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AddressTypeID", nullable = false)
    private AddressType addressTypeID;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public BusinessEntityAddressId getId() {
        return id;
    }

    public void setId(BusinessEntityAddressId id) {
        this.id = id;
    }

    public BusinessEntity getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(BusinessEntity businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
    }

    public AddressType getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(AddressType addressTypeID) {
        this.addressTypeID = addressTypeID;
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