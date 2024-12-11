package kz.abdullaeva.firstProj.controllers;

import kz.abdullaeva.firstProj.dtos.TaskDto;
import kz.abdullaeva.firstProj.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> getAllTasks() { return taskService.getAllTasks();}

    @GetMapping("/{id}")
    public TaskDto getTaskById(@PathVariable("id") long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public void addTask(@RequestBody TaskDto task) {
        taskService.addTask(task);
    }

    @PutMapping
    public void updateTask(@RequestBody TaskDto task) {
        taskService.addTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        taskService.deleteTask(id);
    }
}
