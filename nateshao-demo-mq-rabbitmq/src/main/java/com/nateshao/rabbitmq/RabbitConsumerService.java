package com.nateshao.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumerService {
    @RabbitListener(queues = "test-queue")
    public void receive(String message) {
        System.out.println("RabbitMQ收到消息: " + message);
    }
} 