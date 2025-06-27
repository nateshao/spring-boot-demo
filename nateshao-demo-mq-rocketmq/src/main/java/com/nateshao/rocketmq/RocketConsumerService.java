package com.nateshao.rocketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "test-topic", consumerGroup = "my-group")
public class RocketConsumerService implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println("RocketMQ收到消息: " + message);
    }
} 