package com.nateshao.orm.mybatis.controller;

import com.nateshao.orm.mybatis.entity.User;
import com.nateshao.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam Long id) {
        return userService.findById(id);
    }
} 