package com.nateshao.rocketmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private RocketProducerService rocketProducerService;

    @GetMapping("/send/rocket")
    public String sendRocket(@RequestParam String msg) {
        rocketProducerService.send("test-topic", msg);
        return "RocketMQ消息已发送";
    }
} 