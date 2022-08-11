package com.alok.spring.security.controller;

import com.alok.spring.security.model.Accounts;
import com.alok.spring.security.model.Customer;
import com.alok.spring.security.repository.AccountsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        log.info("received request to get account details for {}: ", customer.getId());
        Accounts accounts = accountsRepository.findByCustomerId(customer.getId());
        if (accounts != null ) {
            return accounts;
        }else {
            return null;
        }
    }
}
