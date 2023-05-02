package com.social.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class AuthController {

    @GetMapping("/public")
    public String PublicFunction() {
        return "Hello, Public";
    }

    @GetMapping("/secured")
    public String SecuredFunction() {
        return "Hello, Secured";
    }
    
}
