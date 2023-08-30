package com.example.home_task_30august.task_1;

import lombok.ToString;

@ToString
public class Order {
    private int price;
    private String item;

//    @Required
    public void setItem(String item) {
        this.item = item;
    }
//    @Required
    public void setPrice(int price) {
        this.price = price;
    }


}


