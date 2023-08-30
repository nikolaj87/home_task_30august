package com.example.home_task_30august.task_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeTask30augustApplication {
//    Создайте простое приложение, предназначенное для работы с клиентами и продуктами.
//   1 Создание продуктов
//   2 Создание клиентов
//   3 Добавление товара в корзину
// post запрос "/customer" - создание клиента, post запрос "/product" - продукта. Продукт автоматически
// попадает в корзину клиента при создании
//http://localhost:8080/swagger-ui/index.html - для запросов
//http://localhost:8080/h2-console/ - хранит созданные сушности
    public static void main(String[] args) {
        SpringApplication.run(HomeTask30augustApplication.class, args);
    }

}
