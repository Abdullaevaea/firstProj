package kz.abdullaeva.firstProj.controllers;

import kz.abdullaeva.firstProj.dtos.UserDto;
import kz.abdullaeva.firstProj.entities.User;
import kz.abdullaeva.firstProj.repositories.UserRepository;
import kz.abdullaeva.firstProj.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() { return userService.getAllUsers(); }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody UserDto user) { userService.addUser(user); }

    @PutMapping
    public void updateUser(@RequestBody UserDto user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        userService.deleteUser(id);
    }

}

