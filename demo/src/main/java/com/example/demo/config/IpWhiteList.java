package com.example.demo.config;

import lombok.Data;

@Data
public class IpWhiteList {
    String whitelist;

    public IpWhiteList(String whitelist) {
        this.whitelist = whitelist;
    }
}
