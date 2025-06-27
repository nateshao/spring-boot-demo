# nateshao-demo-exception-handler

本模块演示 Spring Boot 全局异常处理。

## 主要功能
- 全局异常捕获与统一响应
- 提供异常测试接口

## 依赖
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8080/exception/test
- 返回统一异常响应

## 主要文件说明
- `ExceptionDemoController.java`：异常测试接口
- `GlobalExceptionHandler.java`：全局异常处理

## 验证方式
1. 启动本项目
2. 浏览器访问 http://localhost:8080/exception/test
3. 页面应显示 `全局异常处理: 测试全局异常处理` 