package com.nateshao.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private RabbitProducerService rabbitProducerService;

    @GetMapping("/send/rabbit")
    public String sendRabbit(@RequestParam String msg) {
        rabbitProducerService.send("test-queue", msg);
        return "RabbitMQ消息已发送";
    }
} 