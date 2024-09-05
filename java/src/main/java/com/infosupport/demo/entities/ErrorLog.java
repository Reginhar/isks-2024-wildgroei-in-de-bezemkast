package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "ErrorLog", schema = "dbo")
public class ErrorLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ErrorLogID", nullable = false)
    private Integer id;

    @ColumnDefault("getdate()")
    @Column(name = "ErrorTime", nullable = false)
    private Instant errorTime;

    @Column(name = "ErrorNumber", nullable = false)
    private Integer errorNumber;

    @Column(name = "ErrorSeverity")
    private Integer errorSeverity;

    @Column(name = "ErrorState")
    private Integer errorState;

    @Nationalized
    @Column(name = "ErrorProcedure", length = 126)
    private String errorProcedure;

    @Column(name = "ErrorLine")
    private Integer errorLine;
    @Nationalized
    @Column(name = "ErrorMessage", nullable = false, length = 4000)
    private String errorMessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Instant errorTime) {
        this.errorTime = errorTime;
    }

    public Integer getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    public Integer getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(Integer errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public Integer getErrorState() {
        return errorState;
    }

    public void setErrorState(Integer errorState) {
        this.errorState = errorState;
    }

    public String getErrorProcedure() {
        return errorProcedure;
    }

    public void setErrorProcedure(String errorProcedure) {
        this.errorProcedure = errorProcedure;
    }

    public Integer getErrorLine() {
        return errorLine;
    }

    public void setErrorLine(Integer errorLine) {
        this.errorLine = errorLine;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

/*
 TODO [Reverse Engineering] create field to map the 'UserName' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "UserName", columnDefinition = "sysname not null")
    private Object userName;
*/
}