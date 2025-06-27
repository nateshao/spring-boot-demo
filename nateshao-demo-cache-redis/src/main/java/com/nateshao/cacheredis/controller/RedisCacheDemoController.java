package com.nateshao.cacheredis.controller;

import com.nateshao.cacheredis.service.RedisCacheDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisCacheDemoController {
    @Autowired
    private RedisCacheDemoService redisCacheDemoService;

    @GetMapping("/redis-cache")
    public String redisCache(@RequestParam(defaultValue = "test") String name) {
        return redisCacheDemoService.getData(name);
    }
} 