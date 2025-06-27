# nateshao-demo-mcp

本模块演示 Spring Boot 集成 MCP（RocketMQ 消息队列）。

## 主要功能
- 集成 RocketMQ 消息队列
- 提供消息发送与消费接口

## 依赖
- rocketmq-spring-boot-starter
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8110/mcp/send?msg=hello
- 控制台输出消费消息

## 主要文件说明
- `McpDemoController.java`：消息发送接口
- `McpConsumerListener.java`：消息消费监听
- `application.yml`：RocketMQ 连接配置

## 验证方式
1. 启动本地或云端 RocketMQ（默认端口 9876）
2. 启动本项目
3. 发送 GET 请求：
   ```bash
   curl "http://localhost:8110/mcp/send?msg=hello"
   ```
4. 控制台应输出：`收到MCP消息: hello` 