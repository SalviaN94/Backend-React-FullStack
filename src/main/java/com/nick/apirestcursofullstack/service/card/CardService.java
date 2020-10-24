package com.nick.apirestcursofullstack.service.card;

import com.nick.apirestcursofullstack.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private EntityManager em;

    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }
}
