package com.qt.service;

import com.qt.entities.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
