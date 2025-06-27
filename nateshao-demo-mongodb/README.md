# nateshao-demo-mongodb

Spring Boot 集成 MongoDB 示例。

## 主要功能
- 基于 spring-boot-starter-data-mongodb 实现文档存储和查询

## 运行与验证
1. 启动本地 MongoDB 服务（默认 27017 端口）
2. 启动项目（端口 8104）
3. 访问接口：
   - `POST /mongo/save` 保存文档（body 传 JSON）
   - `GET /mongo/get/{id}` 查询文档 