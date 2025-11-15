package com.example.TestModul2.repository;

import com.example.TestModul2.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    List<Task> taskReository = new ArrayList<>();

    public void add(Task task) {
        taskReository.add(task);
    }

    public List<Task> getAll() {
        return taskReository;
    }
    public void delete(Task task) {
        taskReository.remove(task);
    }
}
