package com.example.home_task_30august.task_2.service;

import com.example.home_task_30august.task_2.dto.PutProductToCustomersCartDTO;
import com.example.home_task_30august.task_2.entity.Customer;
import com.example.home_task_30august.task_2.entity.Product;
import com.example.home_task_30august.task_2.repository.CustomerRepository;
import com.example.home_task_30august.task_2.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
@AllArgsConstructor
public class PutProductToCustomersCart {

    ProductRepository productRepository;
    CustomerRepository customerRepository;

    public void putProductToCustomersCart (PutProductToCustomersCartDTO dto) {

        Optional <Product> productOptional = productRepository.findById(dto.getProductId());
        Optional <Customer> customerOptional = customerRepository.findById(dto.getCustomerId());

        if (productOptional.isPresent() && customerOptional.isPresent()) {
            Product product = productOptional.get();
            product.setCustomer(customerOptional.get());
            productRepository.save(product);
        } else {
            throw new NoSuchElementException();
        }
    }

}
