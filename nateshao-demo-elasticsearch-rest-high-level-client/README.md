# nateshao-demo-elasticsearch-rest-high-level-client

本模块演示 Spring Boot 集成 Elasticsearch Rest High Level Client。

## 主要功能
- 集成 ES Rest High Level Client
- 提供文档保存与查询接口

## 依赖
- elasticsearch-rest-high-level-client
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- POST http://localhost:8095/es-rest/save
  - body: { "field": "value" }
- GET http://localhost:8095/es-rest/get/{id}

## 主要文件说明
- `EsConfig.java`：ES 客户端配置
- `EsRestController.java`：保存与查询接口
- `application.yml`：ES 连接配置

## 验证方式
1. 启动本地 Elasticsearch（默认端口 9200）
2. 启动本项目
3. 保存文档：
   ```bash
   curl -X POST -H "Content-Type: application/json" -d '{"field":"value"}' http://localhost:8095/es-rest/save
   ```
4. 查询文档：
   ```bash
   curl http://localhost:8095/es-rest/get/{id}
   ```
   其中 {id} 为保存返回的 id 