package ru.bank.cardholder.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.model.Card;
import ru.bank.cardholder.repository.CardRepository;

@RestController
@RequestMapping("card")
@AllArgsConstructor
@Slf4j
public class CardController {

    private CardRepository cardRepository;

    @GetMapping(path = "/{number}")
    public String getCard(@PathVariable String number){
        Card card = new Card();
        card.setNumber(number);
        cardRepository.save(card);
        return number;
    }

}
