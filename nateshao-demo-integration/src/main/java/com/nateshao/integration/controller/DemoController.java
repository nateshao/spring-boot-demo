package com.nateshao.integration.controller;

import com.nateshao.integration.kafka.KafkaProducerService;
import com.nateshao.integration.rabbitmq.RabbitProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private KafkaProducerService kafkaProducerService;
    @Autowired
    private RabbitProducerService rabbitProducerService;

    @GetMapping("/send/kafka")
    public String sendKafka(@RequestParam String msg) {
        kafkaProducerService.send("test-topic", msg);
        return "Kafka消息已发送";
    }

    @GetMapping("/send/rabbit")
    public String sendRabbit(@RequestParam String msg) {
        rabbitProducerService.send("test-queue", msg);
        return "RabbitMQ消息已发送";
    }
} 