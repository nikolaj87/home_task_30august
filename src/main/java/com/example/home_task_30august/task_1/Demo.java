package com.example.home_task_30august.task_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configuration.xml");

        Order order = context.getBean("order1", Order.class);
        System.out.println(order);
        // получаю значения указанные в xml файле
    }
}
