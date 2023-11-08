package com.example.SpringBootDemoProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String getHelloMessage(){
        return  "Hello World Good Day !!" ;
    }
}
