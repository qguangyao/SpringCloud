package com.qt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qt.entities.Product;
import com.qt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getNull")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        if (product == null){
            throw new RuntimeException("product为null");
        }
        return product;
    }

    public Product getNull(@PathVariable("id") Long id) {
        Product product =new Product(id,"熔断","未访问数据库");
        return product;
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }
}
