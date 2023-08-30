package com.example.home_task_30august.task_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//  А. Создайте класс Order с полями item и price. Добавьте бин в свой файл конфигурации на основе xml.
// Создайте класс PaymentGateway, в котором Order будет @Autowired.
//     --- создаю бин в xml файле в ресурсах. @Autowired привязываю этот бин

//  Б. На основе прошлого задания используйте аннотацию @Qualifier и @Required на своё усмотрение.
//     --- создаю 2 бина одного типа. И возникает кофликт неопределенности. @Qualifier его решает.
//     @Required так и не заработал. Наверно версия спринга. Но как видно в классе Demo
//    бин создается и его поля автозаполняются через через сеттер и выводятся в консоль. Значит прошивка работает

@Component
class PaymentGateway {

    @Autowired
    @Qualifier("order2")
    Order order;

    public void method () {
        //-------------
    }

}