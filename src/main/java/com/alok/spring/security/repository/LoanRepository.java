package com.alok.spring.security.repository;

import com.alok.spring.security.model.Loans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends MongoRepository<Loans, String> {

    List<Loans> findByCustomerIdOrderByStartDateDesc(String id);
}
