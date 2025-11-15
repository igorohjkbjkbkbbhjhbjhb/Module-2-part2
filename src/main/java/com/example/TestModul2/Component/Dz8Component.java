package com.example.TestModul2.Component;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class Dz8Component {
    private Long id;
    private String description;
    private boolean completed;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        if (id >= 0){
        this.id = id;}
    }

    public void setDescription(String description) {
        for (int i = 0; i <= description.length(); i++) {
            if (description != null && description.charAt(i) != ' ') {
                this.description = description;
            }
        }
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Dz8Component(){



    }
}
