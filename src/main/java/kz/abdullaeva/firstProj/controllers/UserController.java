package kz.abdullaeva.firstProj.controllers;

import kz.abdullaeva.firstProj.entities.User;
import kz.abdullaeva.firstProj.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userRepository.findAllById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        userRepository.deleteById(id);
    }

}

