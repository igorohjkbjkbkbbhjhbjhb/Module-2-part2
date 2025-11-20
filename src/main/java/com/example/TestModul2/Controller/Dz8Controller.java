package com.example.TestModul2.Controller;

import com.example.TestModul2.service.TaskService;
import com.example.TestModul2.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
class Dz8Controller {

    private final TaskService taskService;

    @Autowired
    public Dz8Controller(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/")
    public ResponseEntity<?> addTask(@RequestBody Task task) {
        if (task.getDescription() == null || task.getDescription().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Ошибка: описание задачи не может быть пустым");
        }

        taskService.addTask(task);
        return ResponseEntity.ok(task);
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {
        if (taskService.deleteTask(id)) {
            return ResponseEntity.ok("Задача с id " + id + " удалена.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        if (taskService.putTask(id)) {
            return ResponseEntity.ok("Задача с id " + id + " изменена.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/stats")
    public Map getStats() {
        return taskService.getStats();
    }
}


