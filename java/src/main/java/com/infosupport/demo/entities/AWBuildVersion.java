package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "AWBuildVersion", schema = "dbo")
public class AWBuildVersion {
    @Id
    @Column(name = "SystemInformationID", columnDefinition = "tinyint not null")
    private Short id;

    @Nationalized
    @Column(name = "\"Database Version\"", nullable = false, length = 25)
    private String databaseVersion;

    @Column(name = "VersionDate", nullable = false)
    private Instant versionDate;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public Instant getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Instant versionDate) {
        this.versionDate = versionDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}