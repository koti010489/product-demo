package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    //post get put delete patch
    //http metods
    //get resource get all products from database
    //post create new product
    //put update existing product
    //patch update only few fields in the product
    //delete
    @PostMapping("/api/v1/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
      return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @PutMapping ("/api/v1/product")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @DeleteMapping ("/api/v1/product/{id}")
    public ResponseEntity updateProduct(@PathVariable("id") Long  id){
        productService.deleteProdcut(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/api/v1/product")
    public ResponseEntity<List<Product>> fetchProducts(){
        return new ResponseEntity<>( productService.fetchProducts(),HttpStatus.OK);
    }
}
