package com.qt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.qt.service")
@SpringBootApplication
public class ProductConsumer_8081 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_8081.class, args);
    }
}
