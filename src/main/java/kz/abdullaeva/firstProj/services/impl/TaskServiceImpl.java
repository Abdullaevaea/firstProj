package kz.abdullaeva.firstProj.services.impl;

import kz.abdullaeva.firstProj.entities.Task;

import kz.abdullaeva.firstProj.repositories.TaskRepository;

import kz.abdullaeva.firstProj.services.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findAllById(id);
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }
}

