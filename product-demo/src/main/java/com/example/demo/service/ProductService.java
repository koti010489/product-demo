package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repositry.ProductRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//singleton,prototype,request,response,application
public class ProductService {
    @Autowired
    private ProductRepositry productRepositry;

    public Product saveProduct(Product product){
        productRepositry.save(product);
        return product;

    }

    public Product updateProduct(Product product){
        productRepositry.save(product);
        return product;

    }

    public void deleteProdcut(Long id ){
        Product product = new Product();
        product.setId(id);
        productRepositry.delete(product);


    }

    public List<Product> fetchProducts() {
        return productRepositry.findAll();
    }
}
