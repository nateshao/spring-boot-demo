package com.nateshao.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperHelloController {
    private final CuratorFramework curatorFramework;

    public ZookeeperHelloController(CuratorFramework curatorFramework) {
        this.curatorFramework = curatorFramework;
    }

    @GetMapping("/hello")
    public String hello() throws Exception {
        String path = "/demo-hello";
        byte[] data = "Hello, Zookeeper!".getBytes();
        if (curatorFramework.checkExists().forPath(path) == null) {
            curatorFramework.create().forPath(path, data);
        }
        byte[] result = curatorFramework.getData().forPath(path);
        return new String(result);
    }
} 