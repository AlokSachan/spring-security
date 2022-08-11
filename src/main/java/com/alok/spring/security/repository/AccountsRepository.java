package com.alok.spring.security.repository;

import com.alok.spring.security.model.Accounts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends MongoRepository<Accounts, String> {

    Accounts findByCustomerId(String id);
}
