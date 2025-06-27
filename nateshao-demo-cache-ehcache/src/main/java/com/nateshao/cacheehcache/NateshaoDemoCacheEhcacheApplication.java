package com.nateshao.cacheehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NateshaoDemoCacheEhcacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(NateshaoDemoCacheEhcacheApplication.class, args);
    }
} 