package com.nooble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoodAfternoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodAfternoonApplication.class, args);
    }

}
