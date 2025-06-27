# nateshao-demo-tio

本模块演示 Spring Boot 集成 tio（高性能 Java Socket 框架）。

## 主要内容
- 集成 tio-core-spring-boot-starter 依赖
- 提供 echo 消息处理，端口 6789

## 依赖
```xml
<dependency>
    <groupId>org.t-io</groupId>
    <artifactId>tio-core-spring-boot-starter</artifactId>
    <version>1.2.1</version>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，已配置 tio 相关参数。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 使用 tio 客户端或自定义 TCP 客户端连接 6789 端口，发送消息应收到 echo 响应

## 参考
- [t-io 官方文档](https://www.t-io.org/) 