package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Password", schema = "Person")
public class Password {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private com.infosupport.demo.entities.Person person;

    @Column(name = "PasswordHash", nullable = false, length = 128)
    private String passwordHash;

    @Column(name = "PasswordSalt", nullable = false, length = 10)
    private String passwordSalt;

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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
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