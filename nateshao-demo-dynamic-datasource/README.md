# nateshao-demo-dynamic-datasource

本模块演示 Spring Boot 集成动态数据源（多数据源切换）。

## 主要功能
- 集成 dynamic-datasource-spring-boot-starter
- 提供多数据源切换接口

## 依赖
- dynamic-datasource-spring-boot-starter
- mysql-connector-java
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8093/db1
- GET http://localhost:8093/db2

## 主要文件说明
- `DynamicService.java`：多数据源切换服务
- `DynamicController.java`：多数据源接口
- `application.yml`：多数据源配置

## 验证方式
1. 启动本地 MySQL，创建 test1、test2 两个库，账号 root/root
2. 启动本项目
3. 访问 http://localhost:8093/db1 返回"数据源1数据"
4. 访问 http://localhost:8093/db2 返回"数据源2数据" 