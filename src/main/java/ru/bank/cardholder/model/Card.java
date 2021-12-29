package ru.bank.cardholder.model;

import lombok.Data;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "card")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "number")
    private String number;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "surname")
//    private String surname;
//
//    @Column(name = "validity_period")
//    private String validityPeriod;
//
//    @Column(name = "security_code")
//    private String securityCode;
}
