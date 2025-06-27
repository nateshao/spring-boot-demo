# nateshao-demo-graylog

本模块演示 Spring Boot 集成 Graylog 日志。

## 主要功能
- 集成 Graylog 日志（GELF 协议）
- 提供日志输出测试接口

## 依赖
- logback-gelf
- logback-classic
- spring-boot-starter-web（间接包含 logback）

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8080/graylog
- Graylog 控制台可见日志

## 主要文件说明
- `GraylogDemoController.java`：日志测试接口
- `logback-spring.xml`：Graylog GELF 日志配置

## 验证方式
1. 启动 Graylog 服务（监听 12201 端口，GELF UDP）
2. 启动本项目
3. 浏览器访问 http://localhost:8080/graylog
4. Graylog 控制台应收到 `Graylog 日志测试` 日志 