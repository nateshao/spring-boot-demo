package com.nateshao.rbac.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String userHello() {
        return "Hello, User!";
    }
} 