package com.ankit.springdockerdemo.controller;

import com.ankit.springdockerdemo.Dao.CountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private CountDao countDao;

    @GetMapping("/")
    public String getHelloWorld(){
        return "Welcome To Spring Boot Tutorial with Redis and Docker";
    }

    @GetMapping("/count")
    public Integer getCount(){
        return countDao.getCount();
    }

}
