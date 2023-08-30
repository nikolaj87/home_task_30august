package com.example.home_task_30august.task_2.repository;

import com.example.home_task_30august.task_2.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
