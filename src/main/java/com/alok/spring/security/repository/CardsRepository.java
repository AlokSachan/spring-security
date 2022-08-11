package com.alok.spring.security.repository;

import com.alok.spring.security.model.Cards;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends MongoRepository<Cards,String> {

    List<Cards> findByCustomerId(String id);
}
