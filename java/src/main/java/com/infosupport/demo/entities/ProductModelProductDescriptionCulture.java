package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "ProductModelProductDescriptionCulture", schema = "Production")
public class ProductModelProductDescriptionCulture {
    @EmbeddedId
    private ProductModelProductDescriptionCultureId id;

    @MapsId("cultureID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CultureID", nullable = false)
    private Culture cultureID;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public ProductModelProductDescriptionCultureId getId() {
        return id;
    }

    public void setId(ProductModelProductDescriptionCultureId id) {
        this.id = id;
    }

    public Culture getCultureID() {
        return cultureID;
    }

    public void setCultureID(Culture cultureID) {
        this.cultureID = cultureID;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}