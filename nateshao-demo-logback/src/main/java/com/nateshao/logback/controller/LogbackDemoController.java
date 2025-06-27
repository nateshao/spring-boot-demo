package com.nateshao.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackDemoController {
    private static final Logger logger = LoggerFactory.getLogger(LogbackDemoController.class);

    @GetMapping("/logback")
    public String logback() {
        logger.info("Logback 日志测试");
        return "Logback 日志已发送";
    }
} 