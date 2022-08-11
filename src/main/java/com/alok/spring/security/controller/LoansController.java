package com.alok.spring.security.controller;

import com.alok.spring.security.model.Customer;
import com.alok.spring.security.model.Loans;
import com.alok.spring.security.repository.LoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
public class LoansController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestBody Customer customer){
        log.info("Here are the loan details from the DB");
        List<Loans> loansList= loanRepository.findByCustomerIdOrderByStartDateDesc(customer.getId());
        if(CollectionUtils.isEmpty(loansList)){
            return null;
        }
        else
            return loansList;
    }
}
