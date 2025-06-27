package com.nateshao.cacheehcache.controller;

import com.nateshao.cacheehcache.service.EhcacheDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EhcacheDemoController {
    @Autowired
    private EhcacheDemoService ehcacheDemoService;

    @GetMapping("/ehcache")
    public String ehcache(@RequestParam(defaultValue = "test") String name) {
        return ehcacheDemoService.getData(name);
    }
} 