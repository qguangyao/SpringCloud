package com.qt.controller;

import com.qt.entities.Product;
import com.qt.service.ProductServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Consumer {

    @Autowired
    ProductServiceClient service;

    @RequestMapping(value = "consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }

    @RequestMapping(value = "consumer/product/get/{id}")
    public Product get(@PathVariable(value = "id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "consumer/product/list")
    public List<Product> list() {
        return service.list();
    }
}
