package com.example.TestModul2.Component;

import org.springframework.stereotype.Component;

@Component
public class InfoComponent {
    public String getInfo(){
        return "Это пример компонента которым управляет SpringBoot";
    }

    public String getHello() {
        return "Привет, я спринг бут";
    }
}
