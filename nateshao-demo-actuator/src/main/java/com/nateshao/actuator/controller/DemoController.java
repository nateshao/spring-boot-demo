package com.nateshao.actuator.controller;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private MeterRegistry meterRegistry;

    @GetMapping("/demo")
    public String demo() {
        meterRegistry.counter("custom.api.calls", "type", "demo").increment();
        return "demo ok";
    }
} 