package com.example.md4ajax.controller;


import com.example.md4ajax.model.Product;
import com.example.md4ajax.service.ProductService;
import com.example.md4ajax.service.product.ProductIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
//cho phep truy cap tu been ngoai
public class ProductController {
    @Autowired
    ProductIMPL productService;
    @GetMapping
    public ResponseEntity<Iterable<Product>> findALLProduct(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/order-by-price")
    public ResponseEntity<Iterable<Product>> findAllByOrderByPrice(){
        return new ResponseEntity<>(productService.findAllByOrderByPrice(), HttpStatus.OK);
    }

    @GetMapping("/price-between")
    public ResponseEntity<Iterable<Product>> findAllByPriceBetween(@RequestParam int from ,@RequestParam int to ){
        return new ResponseEntity<>(productService.findAllByPriceBetween(from,to), HttpStatus.OK);
    }

    @GetMapping("/search-name")
    public ResponseEntity<Iterable<Product>> findAllByNameContaining(String name){
        return new ResponseEntity<>(productService.findAllByNameContaining(name), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }



}
