package com.qt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8003.class,args);
    }
}
