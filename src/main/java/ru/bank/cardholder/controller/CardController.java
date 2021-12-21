package ru.bank.cardholder.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.domain.Card;

@RestController
@RequestMapping("card")
public class CardController {

    @GetMapping(path = "/{number}")
    public Card getCard(@PathVariable String number){
        Card card = new Card();
        card.setNumber(number);
        return card;
    }

}
