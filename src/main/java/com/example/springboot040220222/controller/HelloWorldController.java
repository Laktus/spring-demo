package com.example.springboot040220222.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String getHelloWorld(){
        return "<h1>Hello World</h1>";
    }
}