package com.nateshao.cacheredis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheDemoService {
    @Cacheable(value = "demoCache", key = "#name")
    public String getData(String name) {
        return "数据：" + name + "，时间戳：" + System.currentTimeMillis();
    }
} 