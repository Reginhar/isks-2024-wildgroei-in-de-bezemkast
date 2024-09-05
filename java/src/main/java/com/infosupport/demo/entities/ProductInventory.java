package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "ProductInventory", schema = "Production")
public class ProductInventory {
    @EmbeddedId
    private ProductInventoryId id;

    @MapsId("productID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @MapsId("locationID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LocationID", nullable = false)
    private Location locationID;

    @Nationalized
    @Column(name = "Shelf", nullable = false, length = 10)
    private String shelf;

    @Column(name = "Bin", columnDefinition = "tinyint not null")
    private Short bin;

    @ColumnDefault("0")
    @Column(name = "Quantity", nullable = false)
    private Short quantity;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public ProductInventoryId getId() {
        return id;
    }

    public void setId(ProductInventoryId id) {
        this.id = id;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public Location getLocationID() {
        return locationID;
    }

    public void setLocationID(Location locationID) {
        this.locationID = locationID;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public Short getBin() {
        return bin;
    }

    public void setBin(Short bin) {
        this.bin = bin;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
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