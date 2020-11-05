package com.nick.apirestcursofullstack.service.card;

import com.nick.apirestcursofullstack.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
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

    public Card getCardById(Long id){
        return cardRepository.findById(id).get();
    }

    public Card updateCardStock(Long id){
        Card existingCard = cardRepository.findById(id).get();
        existingCard.setStock(existingCard.getStock() - 1);
        cardRepository.save(existingCard);
        return existingCard;
    }
}
