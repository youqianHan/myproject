package com.example.demo.controller;


import com.example.demo.annotation.LimitIp;
import com.example.demo.utils.Iputil2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AController {

    @GetMapping("/atest1")
    @LimitIp()
    public String atest1(HttpServletRequest request){
        String realIP = Iputil2.getRealIP(request);
        return "ATest1"+realIP;
    }

    @GetMapping("/atest2")
    @LimitIp()
    public String atest2(HttpServletRequest request){
        String realIP = Iputil2.getRealIP(request);
        return "ATest2"+realIP;
    }

}
