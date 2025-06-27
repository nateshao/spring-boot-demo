package com.nateshao.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducerService {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String queue, String msg) {
        amqpTemplate.convertAndSend(queue, msg);
    }
} 