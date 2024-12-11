package kz.abdullaeva.firstProj.services.impl;
import kz.abdullaeva.firstProj.dtos.TaskDto;
import kz.abdullaeva.firstProj.entities.Task;
import kz.abdullaeva.firstProj.mapper.TaskMapper;
import kz.abdullaeva.firstProj.repositories.TaskRepository;
import kz.abdullaeva.firstProj.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private TaskMapper taskMapper;

    @Override
    public List<TaskDto> getAllTasks() {
        List<Task> allTasks = taskRepository.findAll();
        return taskMapper.mapToDtoList(allTasks);
    }

    @Override
    public TaskDto getTaskById(Long id) {
        return taskMapper.mapToDto(taskRepository.findById(id).get());
    }

    @Override
    public TaskDto addTask(TaskDto taskDto) {
        return taskMapper.mapToDto(taskRepository.save(taskMapper.mapToEntity(taskDto)));
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto) {
        return taskMapper.mapToDto(taskRepository.save(taskMapper.mapToEntity(taskDto)));
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

