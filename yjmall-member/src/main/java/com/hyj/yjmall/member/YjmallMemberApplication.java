package com.hyj.yjmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.hyj.yjmall.member.fegin")
public class YjmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjmallMemberApplication.class, args);
    }

}
