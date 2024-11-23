package kz.abdullaeva.firstProj.services;

import kz.abdullaeva.firstProj.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task addTask(Task task);

    Task updateTask(Task task);

    void deleteTask(Long id);
}




