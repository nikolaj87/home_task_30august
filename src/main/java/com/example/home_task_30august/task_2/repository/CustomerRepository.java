package com.example.home_task_30august.task_2.repository;

import com.example.home_task_30august.task_2.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
