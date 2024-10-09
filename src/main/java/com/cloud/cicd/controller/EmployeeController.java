package com.cloud.cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getData")
    public String getdata(){
        return "Hello World";
    }


    @GetMapping("/getData1")
    public String getdata1(){
        return "Hello World";
    }


    @GetMapping("/getData2")
    public String getdata2(){
        return "Hello World 2";
    }

    @GetMapping("/getData3")
    public String getdata3(){
        return "Hello World 3";
    }


    @GetMapping("/getData4")
    public String getdata4(){
        return "Hello World 4";
    }
}
