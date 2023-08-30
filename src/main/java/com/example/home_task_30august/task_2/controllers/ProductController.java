package com.example.home_task_30august.task_2.controllers;

import com.example.home_task_30august.task_2.dto.PutProductToCustomersCartDTO;
import com.example.home_task_30august.task_2.entity.Product;
import com.example.home_task_30august.task_2.repository.ProductRepository;
import com.example.home_task_30august.task_2.service.PutProductToCustomersCart;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;
    private PutProductToCustomersCart putProductToCustomersCart;

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
    @PatchMapping
    public void putProductToCustomersCart(@RequestBody PutProductToCustomersCartDTO dto) {
        putProductToCustomersCart.putProductToCustomersCart(dto);
    }
}
