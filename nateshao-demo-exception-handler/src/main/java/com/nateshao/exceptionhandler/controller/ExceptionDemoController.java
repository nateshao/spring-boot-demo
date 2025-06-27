package com.nateshao.exceptionhandler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionDemoController {
    @GetMapping("/exception/test")
    public String testException() {
        throw new RuntimeException("测试全局异常处理");
    }
} 