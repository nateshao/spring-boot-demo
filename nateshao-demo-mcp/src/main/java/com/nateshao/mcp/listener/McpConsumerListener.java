package com.nateshao.mcp.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "demo-topic", consumerGroup = "demo-consumer-group")
public class McpConsumerListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println("收到MCP消息: " + message);
    }
} 