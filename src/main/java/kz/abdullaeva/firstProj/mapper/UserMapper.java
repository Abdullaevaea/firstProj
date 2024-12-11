package kz.abdullaeva.firstProj.mapper;

import kz.abdullaeva.firstProj.dtos.UserDto;
import kz.abdullaeva.firstProj.entities.User;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto mapToDto(User user);
    User mapToEntity(UserDto userDto);
    List<UserDto> mapToDtoList(List<User> users);
    List<User> mapToEntityList(List<UserDto> userDtos);
}
