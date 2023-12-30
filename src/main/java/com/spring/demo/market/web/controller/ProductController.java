package com.spring.demo.market.web.controller;

import com.spring.demo.market.domain.Product;
import com.spring.demo.market.domain.service.ProductService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productID){
        return productService.getProduct(productID);
    }

    public Optional<List<Product>> getByCategory(int categoryID){
        return productService.getByCategory(categoryID);
    }

    public Product save(Product product){
        return productService.save(product);
    }

    public boolean delete(int productId){
        return productService.delete(productId);
    }
}