package com.qt.service;

import com.qt.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFallback implements ProductServiceClient{
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"id="+id+":熔断","无有效数据");
    }

    @Override
    public List<Product> list() {
        return new ArrayList<>();
    }
}
