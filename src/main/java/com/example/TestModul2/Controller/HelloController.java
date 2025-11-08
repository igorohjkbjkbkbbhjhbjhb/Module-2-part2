package com.example.TestModul2.Controller;

import com.example.TestModul2.Component.InfoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    private final InfoComponent infoComponent;

    @Autowired
    public HelloController(InfoComponent ic) {
        this.infoComponent = ic;
//        this.infoComponent = new InfoComponent(); - это плохой пример, потому что
//                                                  у тебя контроллер зависит от определенного объекта
    }

    @GetMapping("/info")
    public String info() {
        return infoComponent.getInfo();
    }

    @GetMapping("/hello")
    public String hello() {
        return infoComponent.getHello();
    }
}