package com.nick.apirestcursofullstack.controller;

import com.nick.apirestcursofullstack.entity.Card;
import com.nick.apirestcursofullstack.logger.LogGetMethod;
import com.nick.apirestcursofullstack.logger.LogPutMethod;
import com.nick.apirestcursofullstack.service.card.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CardsController {

    @Autowired
    private CardService cardService;

    @GetMapping("/cards")
    @LogGetMethod
    public List<Card> getAllCards(HttpServletRequest request){
        return cardService.getAllCards();
    }

    @GetMapping("/cards/{id}")
    @LogGetMethod
    public Card getCard(HttpServletRequest request, @PathVariable long id){
        return cardService.getCardById(id);
    }

    @PutMapping("/cards/{id}")
    @LogPutMethod
    public ResponseEntity<Card> updateCardStock(HttpServletRequest request, @PathVariable long id){
        Card updatedCard = cardService.updateCardStock(id);
        return new ResponseEntity<Card>(updatedCard, HttpStatus.OK);
    }
}
