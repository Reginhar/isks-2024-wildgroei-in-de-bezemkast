package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "SalesOrderHeaderSalesReason", schema = "Sales")
public class SalesOrderHeaderSalesReason {
    @EmbeddedId
    private SalesOrderHeaderSalesReasonId id;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public SalesOrderHeaderSalesReasonId getId() {
        return id;
    }

    public void setId(SalesOrderHeaderSalesReasonId id) {
        this.id = id;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}