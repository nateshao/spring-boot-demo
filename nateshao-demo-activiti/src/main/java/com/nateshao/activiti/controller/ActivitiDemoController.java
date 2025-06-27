package com.nateshao.activiti.controller;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ActivitiDemoController {
    @Autowired
    private RuntimeService runtimeService;

    // 启动流程实例
    @GetMapping("/activiti/start")
    public String startProcess(@RequestParam(defaultValue = "testUser") String user) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("user", user);
        ProcessInstance pi = runtimeService.startProcessInstanceByKey("leaveProcess", vars);
        return "流程启动成功，流程实例ID：" + pi.getId();
    }

    // 查询所有流程实例
    @GetMapping("/activiti/list")
    public List<ProcessInstance> list() {
        return runtimeService.createProcessInstanceQuery().list();
    }
} 