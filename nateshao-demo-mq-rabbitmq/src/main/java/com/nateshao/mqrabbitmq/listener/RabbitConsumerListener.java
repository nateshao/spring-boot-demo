package com.nateshao.mqrabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumerListener {
    @RabbitListener(queues = "demo-queue")
    public void receive(String message) {
        System.out.println("收到RabbitMQ消息: " + message);
    }
} 