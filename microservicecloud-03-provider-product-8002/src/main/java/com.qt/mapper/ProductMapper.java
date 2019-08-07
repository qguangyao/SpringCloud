package com.qt.mapper;

import com.qt.entities.Product;

import java.util.List;

public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
