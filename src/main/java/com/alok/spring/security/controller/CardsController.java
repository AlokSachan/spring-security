package com.alok.spring.security.controller;

import com.alok.spring.security.model.Cards;
import com.alok.spring.security.model.Customer;
import com.alok.spring.security.repository.CardsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CardsController {
    @Autowired
    private CardsRepository cardsRepository;


    @GetMapping(value = "/myCards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cards> getCardsDetails(@RequestBody Customer customer){
        log.info("Here are the cards details from the DB");
        List<Cards> cards= cardsRepository.findByCustomerId(customer.getId());
        if(CollectionUtils.isEmpty(cards))
            return null;
        else
            return cards;
    }
}
