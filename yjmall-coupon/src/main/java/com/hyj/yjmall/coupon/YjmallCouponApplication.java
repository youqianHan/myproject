package com.hyj.yjmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YjmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjmallCouponApplication.class, args);
    }

}