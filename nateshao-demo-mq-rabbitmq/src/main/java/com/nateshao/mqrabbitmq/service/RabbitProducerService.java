package com.nateshao.mqrabbitmq.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducerService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String queue, String message) {
        rabbitTemplate.convertAndSend(queue, message);
    }
} 