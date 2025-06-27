package com.nateshao.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NateshaoDemoAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(NateshaoDemoAsyncApplication.class, args);
    }

}
