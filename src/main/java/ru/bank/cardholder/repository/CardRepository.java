package ru.bank.cardholder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bank.cardholder.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
