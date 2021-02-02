package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IpConfig {

    @Value("${ip.whitelist}")
    String  ipList;

    @Bean
    public IpWhiteList ipList(){

        return new IpWhiteList(ipList);
    }

}
