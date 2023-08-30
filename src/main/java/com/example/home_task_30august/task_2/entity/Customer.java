package com.example.home_task_30august.task_2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PROTECTED, force=true)
@Entity
public class Customer {

    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,
            orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Product> cart = new ArrayList<>();


    public double getCartAmount ( ) {
        return cart.stream()
                .map(Product::getPrice)
                .reduce(Double::sum).orElse(0.0);
    }
}
