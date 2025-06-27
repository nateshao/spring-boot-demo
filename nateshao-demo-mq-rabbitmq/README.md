# nateshao-demo-mq-rabbitmq

Spring Boot 集成 RabbitMQ 消息队列示例。

## 主要功能
- 通过 RabbitTemplate 发送消息
- 通过 @RabbitListener 消费消息

## 运行与验证
1. 启动本地 RabbitMQ 服务（默认 5672 端口）
2. 启动项目（端口 8106）
3. 访问接口：
   - `POST /rabbit/send?message=xxx` 发送消息
   - 控制台可看到消费端收到的消息 