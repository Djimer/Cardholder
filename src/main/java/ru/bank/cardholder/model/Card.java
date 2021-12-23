package ru.bank.cardholder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {

    @Id
    @GeneratedValue
    Long id;

    private String number;
    private String name;
    private String surname;
    private String validityPeriod;
    private String securityCode;
}
