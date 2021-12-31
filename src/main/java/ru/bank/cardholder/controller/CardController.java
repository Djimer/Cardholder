package ru.bank.cardholder.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.model.Card;
import ru.bank.cardholder.repository.CardRepository;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("card")
@AllArgsConstructor
@Slf4j
public class CardController {

    private CardRepository cardRepository;

    @GetMapping(path = "/{number}")
    public List<Card> getCard(@PathVariable String number) {
        var cards = cardRepository.findByNumber(number);
        return cards;
    }

    @PostMapping(path = "/v1",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Card> create(@RequestBody Card card) throws ServerException {
        cardRepository.save(card);
        if (card == null) {
            throw new ServerException("JOKE");
        } else {
            return new ResponseEntity<>(card, HttpStatus.CREATED);
        }
    }
}
