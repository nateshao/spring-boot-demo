# nateshao-demo-template-freemarker

本模块演示 Spring Boot 集成 Freemarker 模板引擎。

## 主要功能
- 集成 Freemarker
- 提供 `/hello` 接口，渲染 hello.ftl 模板

## 依赖
- spring-boot-starter-freemarker
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- 访问 [http://localhost:8080/hello](http://localhost:8080/hello)
- 页面显示 `Hello, Freemarker!`

## 主要文件说明
- `HelloController.java`：控制器，渲染模板
- `templates/hello.ftl`：Freemarker 模板
- `application.properties`：Freemarker 配置

## 验证方式
1. 启动应用
2. 浏览器访问 http://localhost:8080/hello
3. 页面应显示 `Hello, Freemarker!` 