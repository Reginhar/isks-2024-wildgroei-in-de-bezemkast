package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "EmployeeDepartmentHistory", schema = "HumanResources")
public class EmployeeDepartmentHistory {
    @EmbeddedId
    private EmployeeDepartmentHistoryId id;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private Employee businessEntityID;

    @MapsId("departmentID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DepartmentID", nullable = false)
    private Department departmentID;

    @MapsId("shiftID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ShiftID", nullable = false)
    private com.infosupport.demo.entities.Shift shiftID;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public EmployeeDepartmentHistoryId getId() {
        return id;
    }

    public void setId(EmployeeDepartmentHistoryId id) {
        this.id = id;
    }

    public Employee getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Employee businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }

    public com.infosupport.demo.entities.Shift getShiftID() {
        return shiftID;
    }

    public void setShiftID(com.infosupport.demo.entities.Shift shiftID) {
        this.shiftID = shiftID;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}