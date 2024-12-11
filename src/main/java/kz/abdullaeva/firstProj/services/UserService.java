package kz.abdullaeva.firstProj.services;

import kz.abdullaeva.firstProj.dtos.UserDto;
import kz.abdullaeva.firstProj.entities.User;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    UserDto addUser(UserDto user);
    UserDto updateUser(UserDto user);
    void deleteUser(Long id);
}
