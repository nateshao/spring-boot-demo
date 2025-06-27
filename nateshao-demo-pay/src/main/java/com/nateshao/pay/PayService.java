package com.nateshao.pay;

import org.springframework.stereotype.Service;

@Service
public class PayService {
    public String pay(String orderId, double amount) {
        // 模拟支付逻辑
        return "订单 " + orderId + " 支付成功，金额：" + amount;
    }
} 