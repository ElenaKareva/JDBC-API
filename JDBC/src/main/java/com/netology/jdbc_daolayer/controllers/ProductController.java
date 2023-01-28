package com.netology.jdbc_daolayer.controllers;


import com.netology.jdbc_daolayer.person.Person;
import com.netology.jdbc_daolayer.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public Person getSqlSetup(@RequestParam String name) {
        return productRepository.getProductName(name);
    }

    @PostMapping("/post")
    public Person getSqlSetups(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}
