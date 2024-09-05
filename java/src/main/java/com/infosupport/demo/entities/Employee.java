package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Employee", schema = "HumanResources")
public class Employee {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private com.infosupport.demo.entities.Person person;

    @Nationalized
    @Column(name = "NationalIDNumber", nullable = false, length = 15)
    private String nationalIDNumber;

    @Nationalized
    @Column(name = "LoginID", nullable = false, length = 256)
    private String loginID;

    @ColumnDefault("[OrganizationNode].[GetLevel]()")
    @Column(name = "OrganizationLevel")
    private Short organizationLevel;

    @Nationalized
    @Column(name = "JobTitle", nullable = false, length = 50)
    private String jobTitle;

    @Column(name = "BirthDate", nullable = false)
    private LocalDate birthDate;

    @Nationalized
    @Column(name = "MaritalStatus", nullable = false, length = 1)
    private String maritalStatus;

    @Nationalized
    @Column(name = "Gender", nullable = false, length = 1)
    private String gender;

    @Column(name = "HireDate", nullable = false)
    private LocalDate hireDate;

    @ColumnDefault("1")
    @Column(name = "SalariedFlag", nullable = false)
    private Boolean salariedFlag = false;

    @ColumnDefault("0")
    @Column(name = "VacationHours", nullable = false)
    private Short vacationHours;

    @ColumnDefault("0")
    @Column(name = "SickLeaveHours", nullable = false)
    private Short sickLeaveHours;

    @ColumnDefault("1")
    @Column(name = "CurrentFlag", nullable = false)
    private Boolean currentFlag = false;

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

    public com.infosupport.demo.entities.Person getPerson() {
        return person;
    }

    public void setPerson(com.infosupport.demo.entities.Person person) {
        this.person = person;
    }

    public String getNationalIDNumber() {
        return nationalIDNumber;
    }

    public void setNationalIDNumber(String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public Short getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(Short organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Boolean getSalariedFlag() {
        return salariedFlag;
    }

    public void setSalariedFlag(Boolean salariedFlag) {
        this.salariedFlag = salariedFlag;
    }

    public Short getVacationHours() {
        return vacationHours;
    }

    public void setVacationHours(Short vacationHours) {
        this.vacationHours = vacationHours;
    }

    public Short getSickLeaveHours() {
        return sickLeaveHours;
    }

    public void setSickLeaveHours(Short sickLeaveHours) {
        this.sickLeaveHours = sickLeaveHours;
    }

    public Boolean getCurrentFlag() {
        return currentFlag;
    }

    public void setCurrentFlag(Boolean currentFlag) {
        this.currentFlag = currentFlag;
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
 TODO [Reverse Engineering] create field to map the 'OrganizationNode' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "OrganizationNode", columnDefinition = "hierarchyid")
    private Object organizationNode;
*/
}