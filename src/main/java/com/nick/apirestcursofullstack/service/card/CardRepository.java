package com.nick.apirestcursofullstack.service.card;

import com.nick.apirestcursofullstack.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
