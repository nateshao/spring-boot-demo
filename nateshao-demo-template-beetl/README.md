# nateshao-demo-template-beetl

本模块演示 Spring Boot 集成 Beetl 模板引擎。

## 主要内容
- 集成 beetl-spring-boot-starter 依赖
- 提供 /hello 页面，渲染 hello.html 模板

## 依赖
```xml
<dependency>
    <groupId>com.piggsoft</groupId>
    <artifactId>beetl-spring-boot-starter</artifactId>
    <version>0.0.3</version>
</dependency>
```

## 配置
见 `src/main/resources/application.properties`，已配置 beetl 相关参数。

## 启动
```bash
mvn spring-boot:run
```

## 验证
- 访问 http://localhost:8080/hello 应渲染出 "Hello, Beetl!" 页面

## 参考
- [Beetl 官方文档](https://ibeetl.com/) 