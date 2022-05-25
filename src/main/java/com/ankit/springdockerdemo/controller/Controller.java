package com.ankit.springdockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Welcome To Spring Boot Tutorial with Docker";
    }

}
