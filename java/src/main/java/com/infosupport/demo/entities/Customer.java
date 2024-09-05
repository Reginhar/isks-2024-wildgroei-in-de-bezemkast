package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Customer", schema = "Sales")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PersonID")
    private com.infosupport.demo.entities.Person personID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StoreID")
    private com.infosupport.demo.entities.Store storeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TerritoryID")
    private com.infosupport.demo.entities.SalesTerritory territoryID;

    @ColumnDefault("isnull('AW'+[dbo].[ufnLeadingZeros]([CustomerID]), '')")
    @Column(name = "AccountNumber", nullable = false, length = 10)
    private String accountNumber;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.infosupport.demo.entities.Person getPersonID() {
        return personID;
    }

    public void setPersonID(com.infosupport.demo.entities.Person personID) {
        this.personID = personID;
    }

    public com.infosupport.demo.entities.Store getStoreID() {
        return storeID;
    }

    public void setStoreID(com.infosupport.demo.entities.Store storeID) {
        this.storeID = storeID;
    }

    public com.infosupport.demo.entities.SalesTerritory getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(com.infosupport.demo.entities.SalesTerritory territoryID) {
        this.territoryID = territoryID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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