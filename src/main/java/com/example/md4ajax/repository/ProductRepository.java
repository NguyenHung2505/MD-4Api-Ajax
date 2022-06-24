package com.example.md4ajax.repository;

import com.example.md4ajax.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int form ,int to);
    Iterable<Product> findAllByNameContaining(String name);
}
