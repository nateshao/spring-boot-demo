package com.nateshao.diboot.controller;

import com.nateshao.diboot.entity.User;
import com.nateshao.diboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    @PostMapping("/add")
    public boolean add(@RequestBody User user) {
        return userService.save(user);
    }
} 