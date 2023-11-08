package com.example.SpringBootDemoProject.controller;

import com.example.SpringBootDemoProject.Constant.Constant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String getHelloMessage(){
        return Constant.Message ;
    }
}
