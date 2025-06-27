package com.nateshao.mcp.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McpDemoController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/mcp/send")
    public String send(@RequestParam(defaultValue = "hello mcp") String msg) {
        rocketMQTemplate.convertAndSend("demo-topic", msg);
        return "消息已发送: " + msg;
    }
} 