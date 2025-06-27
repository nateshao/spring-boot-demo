# nateshao-demo-zookeeper

本模块演示 Spring Boot 集成 Zookeeper（基于 Curator 客户端）。

## 主要内容
- 集成 curator-framework、curator-recipes 依赖
- 提供 /hello 接口，演示节点创建和读取

## 依赖
```xml
<dependency>
    <groupId>org.apache.curator</groupId>
    <artifactId>curator-framework</artifactId>
    <version>5.4.0</version>
</dependency>
<dependency>
    <groupId>org.apache.curator</groupId>
    <artifactId>curator-recipes</artifactId>
    <version>5.4.0</version>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，已配置 zookeeper 相关参数。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 需本地或远程已启动 zookeeper 服务
- 访问 http://localhost:8080/hello 应返回 "Hello, Zookeeper!"，并在 zookeeper 中创建 /demo-hello 节点

## 参考
- [Curator 官方文档](http://curator.apache.org/) 