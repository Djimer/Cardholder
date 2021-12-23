package ru.bank.cardholder.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.model.Card;

@RestController
@RequestMapping("card")
public class CardController {

    @GetMapping(path = "/{number}")
    public String getCard(@PathVariable String number){
        return "2";
    }

}
