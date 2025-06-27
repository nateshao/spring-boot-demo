package com.nateshao.uflo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UfloHelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Uflo workflow demo is running!";
    }
} 