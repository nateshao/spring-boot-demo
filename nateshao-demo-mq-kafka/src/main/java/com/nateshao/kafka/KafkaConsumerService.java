package com.nateshao.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test-topic")
    public void listen(String message) {
        System.out.println("Kafka收到消息: " + message);
    }
} 