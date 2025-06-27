# nateshao-demo-flyway

本模块演示 Spring Boot 集成 Flyway 数据库迁移。

## 主要功能
- 集成 Flyway 自动数据库迁移
- 提供简单接口验证迁移结果

## 依赖
- spring-boot-starter-jdbc
- flyway-core
- mysql-connector-java

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8098/flyway
- 数据库应有 flyway_demo 表

## 主要文件说明
- `db/migration/V1__init.sql`：初始化建表脚本
- `application.yml`：数据库与 Flyway 配置
- `FlywayDemoController.java`：简单接口

## 验证方式
1. 启动本地 MySQL，创建 test 库，账号 root/root
2. 启动本项目
3. 数据库应自动生成 flyway_demo 表
4. 浏览器访问 http://localhost:8098/flyway
5. 页面应显示 `Flyway migration success!` 