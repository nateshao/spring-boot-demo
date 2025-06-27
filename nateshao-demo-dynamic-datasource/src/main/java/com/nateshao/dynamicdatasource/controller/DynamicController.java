package com.nateshao.dynamicdatasource.controller;

import com.nateshao.dynamicdatasource.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;

    @GetMapping("/db1")
    public String db1() {
        return dynamicService.db1Data();
    }

    @GetMapping("/db2")
    public String db2() {
        return dynamicService.db2Data();
    }
} 