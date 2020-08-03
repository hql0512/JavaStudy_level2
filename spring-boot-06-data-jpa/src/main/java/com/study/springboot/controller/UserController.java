package com.study.springboot.controller;

import com.study.springboot.entity.User;
import com.study.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User user = userRepository.getOne(id);
        return user;
    }

    @GetMapping("/user")
    public User insertEmp(User user) {
        User save = userRepository.save(user);
        return save;
    }

}
