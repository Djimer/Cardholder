package ru.bank.cardholder.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.cardholder.model.Card;
import ru.bank.cardholder.repository.CardRepository;

import java.util.List;

@RestController
@RequestMapping("card")
@RequiredArgsConstructor
@Slf4j
public class CardController {

    @Value("${spring.kafka.template.default-topic}")
    private String topic;

    private final CardRepository cardRepository;

    @Autowired
    private KafkaTemplate<String, Card> kafkaTemplate;

    @GetMapping(path = "/{number}")
    public List<Card> getCard(@PathVariable String number) {
        var cards = cardRepository.findByNumber(number);
        return cards;
    }

    @PostMapping(path = "/v1",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Card> create(@RequestBody Card card) {
        cardRepository.save(card);
        kafkaTemplate.send(topic, card);
        return new ResponseEntity<>(card, HttpStatus.CREATED);
    }
}
