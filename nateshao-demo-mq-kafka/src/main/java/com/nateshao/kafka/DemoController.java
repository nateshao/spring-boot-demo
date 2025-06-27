package com.nateshao.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/send/kafka")
    public String sendKafka(@RequestParam String msg) {
        kafkaProducerService.send("test-topic", msg);
        return "Kafka消息已发送";
    }
} 