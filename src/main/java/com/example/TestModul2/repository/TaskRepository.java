package com.example.TestModul2.repository;

import com.example.TestModul2.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    List<Task> taskRepository = new ArrayList<>();

    int isTaskCompleated = 0;

    int isntTaskCompleated = 0;

    public void add(Task task) {
        taskRepository.add(task);
    }

    public List<Task> getAll() {
        return taskRepository;
    }
    public boolean deleteById(Long id ) {
        return taskRepository.removeIf(task -> task.getId().equals(id));
    }
    public boolean putById(Long id ) {
        for ( Task task : taskRepository){
            if (task.getId().equals(id)) {
                task.setDescription("Задача сделана");
                task.setCompleted(true);
            }
        }
        return true;
    }

    public int getStatsNot() {
        for ( Task task : taskRepository){
            if (!task.isCompleted()) {
                isntTaskCompleated +=1;
            }
        }
        return isntTaskCompleated;

    }
    public int getStats() {
        for ( Task task : taskRepository){
            if (task.isCompleted()) {
                isTaskCompleated +=1;
            }
        }
        return isTaskCompleated;

    }

}
