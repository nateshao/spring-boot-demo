# nateshao-demo-logback

本模块演示 Spring Boot 集成 Logback 日志。

## 主要功能
- 集成 Logback 日志
- 提供日志输出测试接口

## 依赖
- spring-boot-starter-web（间接包含 logback）

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8080/logback
- 控制台输出日志

## 主要文件说明
- `LogbackDemoController.java`：日志测试接口
- `logback-spring.xml`：Logback 配置文件

## 验证方式
1. 启动本项目
2. 浏览器访问 http://localhost:8080/logback
3. 控制台应输出 `Logback 日志测试` 日志 