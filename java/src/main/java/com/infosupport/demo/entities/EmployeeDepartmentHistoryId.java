package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class EmployeeDepartmentHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = -2500994228056448789L;
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "DepartmentID", nullable = false)
    private Short departmentID;

    @Column(name = "ShiftID", columnDefinition = "tinyint not null")
    private Short shiftID;

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Short getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Short departmentID) {
        this.departmentID = departmentID;
    }

    public Short getShiftID() {
        return shiftID;
    }

    public void setShiftID(Short shiftID) {
        this.shiftID = shiftID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeDepartmentHistoryId entity = (EmployeeDepartmentHistoryId) o;
        return Objects.equals(this.shiftID, entity.shiftID) &&
                Objects.equals(this.departmentID, entity.departmentID) &&
                Objects.equals(this.businessEntityID, entity.businessEntityID) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shiftID, departmentID, businessEntityID, startDate);
    }

}