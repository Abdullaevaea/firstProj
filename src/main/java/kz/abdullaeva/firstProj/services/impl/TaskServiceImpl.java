package kz.abdullaeva.firstProj.services.impl;

import kz.abdullaeva.firstProj.dtos.TaskDto;
import kz.abdullaeva.firstProj.entities.Task;
import kz.abdullaeva.firstProj.repositories.TaskRepository;
import kz.abdullaeva.firstProj.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public List<TaskDto> getAllTasks() {
        List<Task> all = taskRepository.findAll();
        return null;
    }

    @Override
    public TaskDto getTaskById(Long id) {
        Task task = taskRepository.findAllById(id);
        TaskDto taskDto = new TaskDto();
        taskDto.setTitle(task.getTitle());
        taskDto.setDescription(task.getDescription());
        return taskDto;
    }

    @Override
    public TaskDto addTask(TaskDto task) {
        return null;
    }

    @Override
    public TaskDto updateTask(Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }
}

