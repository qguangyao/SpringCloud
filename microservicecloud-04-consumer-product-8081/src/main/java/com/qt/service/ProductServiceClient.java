package com.qt.service;

import com.qt.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "microservice-product",fallback = ProductClientFallback.class)
public interface ProductServiceClient {

    @RequestMapping(value = "product/add")
    boolean add(Product product);

    @RequestMapping(value = "product/get/{id}")
    Product get(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "product/list")
    List<Product> list();
}

