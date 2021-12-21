package ru.bank.cardholder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CardholderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardholderApplication.class, args);
    }

}
