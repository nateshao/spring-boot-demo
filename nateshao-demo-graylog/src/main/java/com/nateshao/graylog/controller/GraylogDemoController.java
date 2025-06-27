package com.nateshao.graylog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraylogDemoController {
    private static final Logger logger = LoggerFactory.getLogger(GraylogDemoController.class);

    @GetMapping("/graylog")
    public String graylog() {
        logger.info("Graylog 日志测试");
        return "Graylog 日志已发送";
    }
} 