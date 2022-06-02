package com.alok.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WelcomeController {

    @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayWelcome(){
        log.info("received request in welcome controller");
        return "Welcome from Spring Application without Security";
    }
}
