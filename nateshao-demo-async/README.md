# nateshao-demo-async

本模块演示 Spring Boot 集成异步任务（@Async）。

## 主要功能
- 集成 @Async 实现异步任务
- 提供异步任务接口

## 依赖
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8085/async?name=test
- 控制台输出异步日志

## 主要文件说明
- `AsyncDemoService.java`：异步任务服务
- `AsyncDemoController.java`：异步任务接口
- `NateshaoDemoAsyncApplication.java`：启动类，含 @EnableAsync
- `application.yml`：端口与日志配置

## 验证方式
1. 启动本项目
2. 浏览器访问 http://localhost:8085/async?name=test
3. 页面立即返回，控制台延迟输出"异步任务开始/结束"日志 