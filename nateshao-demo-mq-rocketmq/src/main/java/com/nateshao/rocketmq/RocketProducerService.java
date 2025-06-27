package com.nateshao.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RocketProducerService {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void send(String topic, String msg) {
        rocketMQTemplate.convertAndSend(topic, msg);
    }
} 