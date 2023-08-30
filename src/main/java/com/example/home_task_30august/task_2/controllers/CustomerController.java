package com.example.home_task_30august.task_2.controllers;

import com.example.home_task_30august.task_2.entity.Customer;
import com.example.home_task_30august.task_2.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

}
