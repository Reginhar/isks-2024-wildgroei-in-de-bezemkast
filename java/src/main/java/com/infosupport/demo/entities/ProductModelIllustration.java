package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "ProductModelIllustration", schema = "Production")
public class ProductModelIllustration {
    @EmbeddedId
    private ProductModelIllustrationId id;

    @MapsId("illustrationID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IllustrationID", nullable = false)
    private Illustration illustrationID;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public ProductModelIllustrationId getId() {
        return id;
    }

    public void setId(ProductModelIllustrationId id) {
        this.id = id;
    }

    public Illustration getIllustrationID() {
        return illustrationID;
    }

    public void setIllustrationID(Illustration illustrationID) {
        this.illustrationID = illustrationID;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}