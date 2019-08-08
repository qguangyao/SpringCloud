package com.qt;


import com.qt.config.SwaggerConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Import;
@EnableHystrix
@EnableEurekaClient
@MapperScan("com.qt.mapper")
@SpringBootApplication
@Import({SwaggerConfiguration.class})
public class ProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
