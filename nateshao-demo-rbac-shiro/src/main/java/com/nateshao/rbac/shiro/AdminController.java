package com.nateshao.rbac.shiro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin/hello")
    public String adminHello() {
        return "Hello, Shiro Admin!";
    }
} 