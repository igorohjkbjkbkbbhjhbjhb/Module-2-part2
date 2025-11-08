package com.example.TestModul2.Controller;

import com.example.TestModul2.Component.Dz8Component;
import com.example.TestModul2.Component.InfoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class Dz8Controller {

    private final Dz8Component dz8Component;
    @Autowired
    public Dz8Controller(Dz8Component d8) {
        this.dz8Component = d8;

        List<Task> tasks = new ArrayList<>();
    }
        @GetMapping("/statsTotalTasks")
        int statsTotalTasks(){return Math.toIntExact(dz8Component.getTotalTasks());}

        @GetMapping("/statsCompletedTasts")
        int statsCompletedTasts(){return Math.toIntExact(dz8Component.getCompletedTasts());}

        @GetMapping("/statsPendingTasks")
        int statsPendingTasks(){return Math.toIntExact(dz8Component.getPendingTasks());}

    }


