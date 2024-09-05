package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "CreditCard", schema = "Sales")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CreditCardID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "CardType", nullable = false, length = 50)
    private String cardType;

    @Nationalized
    @Column(name = "CardNumber", nullable = false, length = 25)
    private String cardNumber;

    @Column(name = "ExpMonth", columnDefinition = "tinyint not null")
    private Short expMonth;

    @Column(name = "ExpYear", nullable = false)
    private Short expYear;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Short getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(Short expMonth) {
        this.expMonth = expMonth;
    }

    public Short getExpYear() {
        return expYear;
    }

    public void setExpYear(Short expYear) {
        this.expYear = expYear;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}