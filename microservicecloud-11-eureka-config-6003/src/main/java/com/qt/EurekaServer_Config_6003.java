package com.qt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6003.class,args);
    }
}
