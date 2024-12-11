package kz.abdullaeva.firstProj.mapper;

import kz.abdullaeva.firstProj.dtos.TaskDto;
import kz.abdullaeva.firstProj.dtos.UserDto;
import kz.abdullaeva.firstProj.entities.Task;
import kz.abdullaeva.firstProj.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto mapToDto(Task task);
    Task mapToEntity(TaskDto taskDto);
    List<TaskDto> mapToDtoList(List<Task> tasks);
    List<Task> mapToEntityList(List<Task> taskDtos);

}
