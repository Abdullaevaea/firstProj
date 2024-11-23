package kz.abdullaeva.firstProj.controllers;

import kz.abdullaeva.firstProj.entities.Task;
import kz.abdullaeva.firstProj.entities.User;
import kz.abdullaeva.firstProj.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") long id) {
        return taskRepository.findAllById(id);
    }
    @PostMapping
    public void addTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @PutMapping
    public void updateTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        taskRepository.deleteById(id);
    }
}
