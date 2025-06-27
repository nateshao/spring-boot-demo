# nateshao-demo-mongodb

本模块演示 Spring Boot 集成 MongoDB。

## 主要功能
- 集成 MongoDB
- 提供文档保存与查询接口

## 依赖
- spring-boot-starter-data-mongodb
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- POST http://localhost:8104/mongo/save
  - body: { "content": "hello mongo" }
- GET http://localhost:8104/mongo/get/{id}

## 主要文件说明
- `DemoDoc.java`：MongoDB 文档实体
- `DemoRepository.java`：MongoRepository 接口
- `MongoDemoController.java`：保存与查询接口
- `application.yml`：MongoDB 连接配置

## 验证方式
1. 启动本地 MongoDB 服务（默认端口 27017，数据库 test）
2. 启动本项目
3. 保存文档：
   ```bash
   curl -X POST -H "Content-Type: application/json" -d '{"content":"hello mongo"}' http://localhost:8104/mongo/save
   ```
4. 查询文档：
   ```bash
   curl http://localhost:8104/mongo/get/{id}
   ```
   其中 {id} 为保存返回的 id 