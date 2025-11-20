package com.example.TestModul2.service;
import com.example.TestModul2.Component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;

public class MyService {

    private final MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("Сервисный класс сконструирован");
    }

    public void doSomething() {
        System.out.println("Выполняется логика сервиса");
    }
}
