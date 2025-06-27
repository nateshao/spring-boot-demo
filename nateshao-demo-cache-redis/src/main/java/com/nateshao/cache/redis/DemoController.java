package com.nateshao.cache.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private RedisService redisService;

    @GetMapping("/redis/set")
    public String set(@RequestParam String key, @RequestParam String value) {
        redisService.set(key, value);
        return "OK";
    }

    @GetMapping("/redis/get")
    public String get(@RequestParam String key) {
        return redisService.get(key);
    }
} 