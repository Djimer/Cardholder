package ru.bank.cardholder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bank.cardholder.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
