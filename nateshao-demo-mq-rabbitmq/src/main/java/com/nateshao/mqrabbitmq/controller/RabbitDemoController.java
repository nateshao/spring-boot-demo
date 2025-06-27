package com.nateshao.mqrabbitmq.controller;

import com.nateshao.mqrabbitmq.service.RabbitProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbit")
public class RabbitDemoController {
    @Autowired
    private RabbitProducerService producerService;

    @PostMapping("/send")
    public String send(@RequestParam String message) {
        producerService.send("demo-queue", message);
        return "消息已发送: " + message;
    }
} 