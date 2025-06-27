package com.nateshao.pay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String pay(@RequestParam String orderId, @RequestParam double amount) {
        return payService.pay(orderId, amount);
    }
} 