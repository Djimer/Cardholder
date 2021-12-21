package ru.bank.cardholder.entity;

import lombok.Data;

@Data
public class Card {
    private String number;
    private String name;
    private String surname;
    private String validityPeriod;
    private String securityCode;
}
