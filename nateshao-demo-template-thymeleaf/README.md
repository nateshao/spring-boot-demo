# nateshao-demo-template-thymeleaf

本模块演示 Spring Boot 集成 Thymeleaf 模板引擎。

## 主要内容
- 集成 spring-boot-starter-thymeleaf 依赖
- 提供 /hello 页面，渲染 hello.html 模板

## 依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，已配置 thymeleaf 相关参数。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 访问 http://localhost:8080/hello 应渲染出 "Hello, Thymeleaf!" 页面

## 参考
- [Thymeleaf 官方文档](https://www.thymeleaf.org/) 