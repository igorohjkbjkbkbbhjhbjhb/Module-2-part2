package com.example.TestModul2.service;

import com.example.TestModul2.model.Task;
import com.example.TestModul2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final AtomicLong idCounter = new AtomicLong(1);

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task) {
        task.setId(idCounter.getAndIncrement());
        taskRepository.add(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.getAll();
    }
    public void deleteTasks(Task task) {
        this.taskRepository.delete(task);
    }
}
