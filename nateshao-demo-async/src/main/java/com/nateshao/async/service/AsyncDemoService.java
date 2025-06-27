package com.nateshao.async.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncDemoService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncDemoService.class);

    @Async
    public void asyncTask(String name) {
        logger.info("异步任务开始，参数：{}", name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        logger.info("异步任务结束，参数：{}", name);
    }
} 