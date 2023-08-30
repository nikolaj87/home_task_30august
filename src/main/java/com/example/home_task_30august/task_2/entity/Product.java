package com.example.home_task_30august.task_2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PROTECTED, force=true)
@Entity
public class Product {

        @Id
        private Integer id;

        private String code;
        private String label;

        private Double price;

        @ManyToOne
        @JoinColumn(name = "customer_id")
        private Customer customer;

    }