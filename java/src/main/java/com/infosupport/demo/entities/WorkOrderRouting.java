package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "WorkOrderRouting", schema = "Production")
public class WorkOrderRouting {
    @EmbeddedId
    private WorkOrderRoutingId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LocationID", nullable = false)
    private Location locationID;

    @Column(name = "ScheduledStartDate", nullable = false)
    private Instant scheduledStartDate;

    @Column(name = "ScheduledEndDate", nullable = false)
    private Instant scheduledEndDate;

    @Column(name = "ActualStartDate")
    private Instant actualStartDate;

    @Column(name = "ActualEndDate")
    private Instant actualEndDate;

    @Column(name = "ActualResourceHrs", precision = 9, scale = 4)
    private BigDecimal actualResourceHrs;

    @Column(name = "PlannedCost", nullable = false)
    private BigDecimal plannedCost;

    @Column(name = "ActualCost")
    private BigDecimal actualCost;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public WorkOrderRoutingId getId() {
        return id;
    }

    public void setId(WorkOrderRoutingId id) {
        this.id = id;
    }

    public Location getLocationID() {
        return locationID;
    }

    public void setLocationID(Location locationID) {
        this.locationID = locationID;
    }

    public Instant getScheduledStartDate() {
        return scheduledStartDate;
    }

    public void setScheduledStartDate(Instant scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    public Instant getScheduledEndDate() {
        return scheduledEndDate;
    }

    public void setScheduledEndDate(Instant scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public Instant getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Instant actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Instant getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Instant actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public BigDecimal getActualResourceHrs() {
        return actualResourceHrs;
    }

    public void setActualResourceHrs(BigDecimal actualResourceHrs) {
        this.actualResourceHrs = actualResourceHrs;
    }

    public BigDecimal getPlannedCost() {
        return plannedCost;
    }

    public void setPlannedCost(BigDecimal plannedCost) {
        this.plannedCost = plannedCost;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}