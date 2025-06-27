# nateshao-demo-elasticsearch

本模块演示 Spring Boot 集成 Spring Data Elasticsearch。

## 主要功能
- 集成 Spring Data Elasticsearch
- 提供文档保存与查询接口

## 依赖
- spring-boot-starter-data-elasticsearch
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- POST http://localhost:8094/es/save
  - body: { "content": "hello es" }
- GET http://localhost:8094/es/get/{id}

## 主要文件说明
- `DemoDoc.java`：ES 文档实体
- `DemoRepository.java`：ElasticsearchRepository 接口
- `DemoEsController.java`：保存与查询接口
- `application.yml`：ES 连接配置

## 验证方式
1. 启动本地 Elasticsearch（默认端口 9200，集群名 docker-cluster）
2. 启动本项目
3. 保存文档：
   ```bash
   curl -X POST -H "Content-Type: application/json" -d '{"content":"hello es"}' http://localhost:8094/es/save
   ```
4. 查询文档：
   ```bash
   curl http://localhost:8094/es/get/{id}
   ```
   其中 {id} 为保存返回的 id 