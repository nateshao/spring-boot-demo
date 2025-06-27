# nateshao-demo-mq-rabbitmq

本模块演示 Spring Boot 集成 RabbitMQ。

## 主要功能
- 集成 RabbitMQ
- 提供消息发送接口
- 实现消息监听消费

## 依赖
- spring-boot-starter-amqp
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- POST http://localhost:8106/rabbit/send?message=hello
- 控制台输出消费消息

## 主要文件说明
- `RabbitDemoController.java`：消息发送接口
- `RabbitProducerService.java`：消息发送服务
- `RabbitConsumerListener.java`：消息消费监听
- `application.yml`：RabbitMQ 连接配置

## 验证方式
1. 启动 RabbitMQ 服务（本地或远程，默认端口 5672，guest/guest）
2. 启动本项目
3. 发送 POST 请求：
   ```bash
   curl -X POST "http://localhost:8106/rabbit/send?message=hello"
   ```
4. 控制台应输出：`收到RabbitMQ消息: hello`

## 一键启动（Docker Compose）

1. **打包项目**
   ```bash
   mvn clean package -DskipTests
   ```
2. **启动服务**
   ```bash
   docker-compose up --build
   ```
   这会自动启动 RabbitMQ 和 Spring Boot 应用。

3. **验证接口**
   - 发送RabbitMQ消息：
     ```bash
     curl "http://localhost:8080/send/rabbit?msg=hello-docker"
     ```
   - 查看控制台日志，应该能看到RabbitMQ消费者收到消息。

## 端口说明
- Spring Boot: `8080`
- RabbitMQ: `5672`（AMQP），`15672`（管理界面）

---

如需停止服务：
```bash
docker-compose down
``` 