package com.nateshao.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        boolean healthy = true; // 可替换为实际检测逻辑
        if (healthy) {
            return Health.up().withDetail("custom", "服务正常").build();
        } else {
            return Health.down().withDetail("custom", "服务异常").build();
        }
    }
} 