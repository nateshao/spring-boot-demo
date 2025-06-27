# nateshao-demo-websocket

本模块演示 Spring Boot 集成 WebSocket。

## 主要内容
- 集成 spring-boot-starter-websocket 依赖
- 提供 /ws/hello WebSocket 服务，支持消息 echo

## 依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，已配置基础参数。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 使用 WebSocket 客户端（如浏览器、Postman、websocat 等）连接 ws://localhost:8080/ws/hello
- 发送任意消息，应收到 "Echo: 消息内容" 的响应

## 参考
- [Spring WebSocket 官方文档](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#websocket) 