package com.nateshao.urule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UruleHelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Urule rule engine demo is running!";
    }
} 