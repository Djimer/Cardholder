package ru.bank.cardholder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String number;
    private String name;
    private String surname;
    private String validityPeriod;
    private String securityCode;
}
