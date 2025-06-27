package com.nateshao.flyway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlywayDemoController {
    @GetMapping("/flyway")
    public String flyway() {
        return "Flyway migration success!";
    }
} 