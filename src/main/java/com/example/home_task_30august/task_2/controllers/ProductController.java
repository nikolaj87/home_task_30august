package com.example.home_task_30august.task_2.controllers;

import com.example.home_task_30august.task_2.entity.Product;
import com.example.home_task_30august.task_2.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
