package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "EmailAddress", schema = "Person")
public class EmailAddress {
    @EmbeddedId
    private EmailAddressId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private com.infosupport.demo.entities.Person businessEntityID;

    @Nationalized
    @Column(name = "EmailAddress", length = 50)
    private String emailAddress;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public EmailAddressId getId() {
        return id;
    }

    public void setId(EmailAddressId id) {
        this.id = id;
    }

    public com.infosupport.demo.entities.Person getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(com.infosupport.demo.entities.Person businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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