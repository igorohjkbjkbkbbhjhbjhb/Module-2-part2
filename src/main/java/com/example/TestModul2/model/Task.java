package com.example.TestModul2.model;

import org.springframework.stereotype.Component;

public class Task {
    private Long id;
    private String description;
    private boolean completed;

    public Task() {}

    //    public Task(String description) {
//        this.description = description;
//        this.id = idCounter++;
//    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public boolean isCompleted() {

        return completed;
    }

    public void setCompleted(boolean completed) {

        this.completed = completed;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
