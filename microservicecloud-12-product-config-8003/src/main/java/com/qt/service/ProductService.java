package com.qt.service;

import com.qt.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
