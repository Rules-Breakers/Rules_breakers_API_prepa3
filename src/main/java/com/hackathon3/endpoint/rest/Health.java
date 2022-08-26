package com.hackathon3.endpoint.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class Health {
    @GetMapping("/")
    public String ping(){
        return "Hello you're the Rules Breakers";
    }

/**  TODO :  @GetMapping("/whoami")
    public String getRole(){
        return "Hello you're the Rules Breakers";
    } */
}
