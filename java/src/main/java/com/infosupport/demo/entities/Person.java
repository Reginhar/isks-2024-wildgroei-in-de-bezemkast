package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Person", schema = "Person")
public class Person {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "PersonType", nullable = false, length = 2)
    private String personType;

    @Nationalized
    @Column(name = "Title", length = 8)
    private String title;

    @Lob
    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Lob
    @Column(name = "MiddleName")
    private String middleName;

    @Lob
    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Nationalized
    @Column(name = "Suffix", length = 10)
    private String suffix;

    @ColumnDefault("0")
    @Column(name = "EmailPromotion", nullable = false)
    private Integer emailPromotion;

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

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(Integer emailPromotion) {
        this.emailPromotion = emailPromotion;
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
 TODO [Reverse Engineering] create field to map the 'NameStyle' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("0")
    @Column(name = "NameStyle", columnDefinition = "NameStyle not null")
    private Object nameStyle;
*/
}