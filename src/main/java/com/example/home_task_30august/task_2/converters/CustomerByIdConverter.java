//package com.example.home_task_30august.task_2.converters;
//
//
//import com.example.home_task_30august.task_2.entity.Customer;
//import com.example.home_task_30august.task_2.repository.CustomerRepository;
//import org.springframework.stereotype.Component;
//import org.springframework.core.convert.converter.Converter;
//
//@Component
//public class CustomerByIdConverter implements Converter<Integer, Customer> {
//    private final CustomerRepository customerRepository;
//
//    public CustomerByIdConverter(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @Override
//    public Customer convert(Integer id) {
//        System.out.println(id);
//        Customer customer = customerRepository.findById(id).orElse(null);
//        System.out.println(customer);
//        return customer;
//    }
//}