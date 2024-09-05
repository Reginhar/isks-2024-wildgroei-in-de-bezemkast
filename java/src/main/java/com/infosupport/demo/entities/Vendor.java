package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "Vendor", schema = "Purchasing")
public class Vendor {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CreditRating", columnDefinition = "tinyint not null")
    private Short creditRating;

    @ColumnDefault("1")
    @Column(name = "PreferredVendorStatus", nullable = false)
    private Boolean preferredVendorStatus = false;

    @ColumnDefault("1")
    @Column(name = "ActiveFlag", nullable = false)
    private Boolean activeFlag = false;

    @Nationalized
    @Column(name = "PurchasingWebServiceURL", length = 1024)
    private String purchasingWebServiceURL;
    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Short creditRating) {
        this.creditRating = creditRating;
    }

    public Boolean getPreferredVendorStatus() {
        return preferredVendorStatus;
    }

    public void setPreferredVendorStatus(Boolean preferredVendorStatus) {
        this.preferredVendorStatus = preferredVendorStatus;
    }

    public Boolean getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getPurchasingWebServiceURL() {
        return purchasingWebServiceURL;
    }

    public void setPurchasingWebServiceURL(String purchasingWebServiceURL) {
        this.purchasingWebServiceURL = purchasingWebServiceURL;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

/*
 TODO [Reverse Engineering] create field to map the 'AccountNumber' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "AccountNumber", columnDefinition = "AccountNumber not null")
    private Object accountNumber;
*/
}