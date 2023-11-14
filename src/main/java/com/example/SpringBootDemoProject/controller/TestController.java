package com.example.SpringBootDemoProject.controller;

import com.example.SpringBootDemoProject.Constant.Constant;
import com.example.SpringBootDemoProject.service.TestService;
import com.oracle.svm.core.annotate.Inject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/statement")
public class TestController {

    @Inject
    public TestService testService ;

    @GetMapping("/hello")
    public String getHelloMessage(){
        return Constant.Message ;
    }

    @GetMapping("/{arrangementID}")
    public String getStatementDetails(@PathVariable int arrangementID){
        return  testService.getStatementDetails(arrangementID);
    }
}
