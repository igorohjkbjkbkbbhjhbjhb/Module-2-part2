package com.example.TestModul2.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Component // Аннотируем класс компонентом Spring
public class MyComponent {

    public MyComponent() {
        System.out.println("Конструктор компонента вызван");
    }

    @PostConstruct // Метод выполняется сразу после завершения создания экземпляра класса
    public void init() {
        System.out.println("@PostConstruct метод выполнен");
    }

    @PreDestroy // Метод выполняется перед уничтожением компонента
    public void destroy() {
        System.out.println("@PreDestroy метод выполнен");
    }
}