package kz.abdullaeva.firstProj.services;

import kz.abdullaeva.firstProj.dtos.TaskDto;
import kz.abdullaeva.firstProj.entities.Task;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAllTasks();

    TaskDto getTaskById(Long id);

    TaskDto addTask(TaskDto task);

    TaskDto updateTask(Task task);

    void deleteTask(Long id);
}




