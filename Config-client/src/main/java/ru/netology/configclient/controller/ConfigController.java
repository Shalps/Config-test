package ru.netology.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${my.app.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage(){
        return message;
    }
}
