package kz.abdullaeva.firstProj.services.impl;

import kz.abdullaeva.firstProj.dtos.UserDto;
import kz.abdullaeva.firstProj.entities.User;
import kz.abdullaeva.firstProj.mapper.UserMapper;
import kz.abdullaeva.firstProj.repositories.UserRepository;
import kz.abdullaeva.firstProj.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.mapToDtoList(users);
    }
    @Override
    public UserDto getUserById(Long id) {
        return userMapper.mapToDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        return userMapper.mapToDto(userRepository.save(userMapper.mapToEntity(userDto)));
    }

    @Override
    public UserDto updateUser(UserDto user) {
        return userMapper.mapToDto(userRepository.save(userMapper.mapToEntity(user)));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
