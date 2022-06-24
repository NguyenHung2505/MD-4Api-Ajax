package com.example.md4ajax.service;

import com.example.md4ajax.model.Product;
import com.example.md4ajax.service.GeneraService;

public interface ProductService extends GeneraService<Product> {
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int form ,int to);
    Iterable<Product> findAllByNameContaining(String name);
}
