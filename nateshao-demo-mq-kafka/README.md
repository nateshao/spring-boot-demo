# Spring Boot Kafka Demo

## 一键启动（Docker Compose）

1. **打包项目**
   ```bash
   mvn clean package -DskipTests
   ```
2. **启动服务**
   ```bash
   docker-compose up --build
   ```
   这会自动启动 Zookeeper、Kafka 和 Spring Boot 应用。

3. **验证接口**
   - 发送Kafka消息：
     ```bash
     curl "http://localhost:8080/send/kafka?msg=hello-docker"
     ```
   - 查看控制台日志，应该能看到Kafka消费者收到消息。

## 端口说明
- Spring Boot: `8080`
- Kafka: `9092`
- Zookeeper: `2181`

---

如需停止服务：
```bash
docker-compose down
``` 