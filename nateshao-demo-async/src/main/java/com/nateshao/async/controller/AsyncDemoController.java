package com.nateshao.async.controller;

import com.nateshao.async.service.AsyncDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncDemoController {
    @Autowired
    private AsyncDemoService asyncDemoService;

    @GetMapping("/async")
    public String async(@RequestParam(defaultValue = "test") String name) {
        asyncDemoService.asyncTask(name);
        return "异步任务已提交，参数：" + name;
    }
} 