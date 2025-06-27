# nateshao-demo-dynamic-datasource

Spring Boot 动态多数据源切换示例。

## 主要功能
- 基于 dynamic-datasource-spring-boot-starter 实现多数据源
- 注解 @DS 实现方法级数据源切换

## 运行与验证
1. 配置好 test1、test2 两个 MySQL 数据库
2. 启动项目（端口 8093）
3. 访问接口：
   - `GET /db1` 访问数据源1
   - `GET /db2` 访问数据源2 