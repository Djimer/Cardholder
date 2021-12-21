package ru.bank.cardholder.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.entity.Card;

@RestController
public class CardController {

    @RequestMapping(value = "/getCard" , method = RequestMethod.GET)
    public Card getCard(){
        return new Card();
    }

}
