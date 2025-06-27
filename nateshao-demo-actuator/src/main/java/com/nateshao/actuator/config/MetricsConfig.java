package com.nateshao.actuator.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MetricsConfig {
    @Autowired
    private MeterRegistry meterRegistry;

    @PostConstruct
    public void init() {
        meterRegistry.counter("custom.api.calls", "type", "demo");
    }
} 