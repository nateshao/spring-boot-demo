# nateshao-demo-urule

本模块演示 Spring Boot 集成 [urule 规则引擎](https://github.com/youseries/urule)。

## 主要内容
- 集成 urule-core、urule-console 依赖
- 基于 H2 内存数据库的最小运行配置
- 提供 /hello 测试接口
- 可通过 http://localhost:8080/urule/frame 访问 urule 控制台

## 依赖
```xml
<dependency>
    <groupId>com.bstek.urule</groupId>
    <artifactId>urule-core</artifactId>
    <version>2.1.5</version>
</dependency>
<dependency>
    <groupId>com.bstek.urule</groupId>
    <artifactId>urule-console</artifactId>
    <version>2.1.5</version>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，默认使用 H2 内存数据库。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 访问 http://localhost:8080/hello 应返回 `Urule rule engine demo is running!`
- 访问 http://localhost:8080/urule/frame 进入 urule 控制台

## 参考
- [urule 官方文档](https://github.com/youseries/urule)

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)

