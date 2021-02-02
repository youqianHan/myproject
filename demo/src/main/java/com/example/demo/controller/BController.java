package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
    @GetMapping("/btest1")
    public String btest1(){
        return "B1Test1";
    }

    @GetMapping("/btest2")
    public String btest2(){
        return "BTest2";
    }
}
