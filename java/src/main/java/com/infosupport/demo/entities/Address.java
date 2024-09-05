package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Address", schema = "Person")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "AddressLine1", nullable = false, length = 60)
    private String addressLine1;

    @Nationalized
    @Column(name = "AddressLine2", length = 60)
    private String addressLine2;

    @Nationalized
    @Column(name = "City", nullable = false, length = 30)
    private String city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "StateProvinceID", nullable = false)
    private com.infosupport.demo.entities.StateProvince stateProvinceID;

    @Nationalized
    @Column(name = "PostalCode", nullable = false, length = 15)
    private String postalCode;

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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public com.infosupport.demo.entities.StateProvince getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(com.infosupport.demo.entities.StateProvince stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

/*
 TODO [Reverse Engineering] create field to map the 'SpatialLocation' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "SpatialLocation", columnDefinition = "geography")
    private Object spatialLocation;
*/
}