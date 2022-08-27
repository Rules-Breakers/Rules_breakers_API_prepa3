package com.hackathon3.endpoint.rest;

import com.hackathon3.service.RegistrationService;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path =  "/login")
@AllArgsConstructor
@CrossOrigin("*")
@RestController
@EqualsAndHashCode
public class LoginController {
    private RegistrationService registrationService;
 /**   @PostMapping
    public String login(@RequestBody User loginUser) {
        if(loginUser.getPassword().equals(registrationService.getPassword(loginUser.getName()))){
            registrationService.loadUserByUsername(loginUser.getName());
            return "connexion faite";
        }
        return "invalide coordonnée";
    }*/
}
