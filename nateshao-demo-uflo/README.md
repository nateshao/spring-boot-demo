# nateshao-demo-uflo

本模块演示 Spring Boot 集成 [uflo 工作流引擎](http://uflo.cn/)。

## 主要内容
- 集成 uflo-core、uflo-console 依赖
- 基于 H2 内存数据库的最小运行配置
- 提供 /hello 测试接口
- 可通过 http://localhost:8080/uflo/console 访问 uflo 控制台

## 依赖
```xml
<dependency>
    <groupId>com.bstek.uflo</groupId>
    <artifactId>uflo-core</artifactId>
    <version>2.1.5</version>
</dependency>
<dependency>
    <groupId>com.bstek.uflo</groupId>
    <artifactId>uflo-console</artifactId>
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
- 访问 http://localhost:8080/hello 应返回 `Uflo workflow demo is running!`
- 访问 http://localhost:8080/uflo/console 进入 uflo 控制台（默认账号 admin/admin）

## 参考
- [uflo 官方文档](http://uflo.cn/) 