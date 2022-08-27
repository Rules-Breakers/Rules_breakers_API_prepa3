package com.hackathon3.endpoint.rest;

import com.hackathon3.model.Users;
import com.hackathon3.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path =  "/signup")
@AllArgsConstructor
@CrossOrigin("*")
@RestController
public class RegistrationController {
        private RegistrationService registrationService;
        @PostMapping
        public String register(@RequestBody Users request) {
            return registrationService.signUp(request);
        }
}
