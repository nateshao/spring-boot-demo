# nateshao-demo-elasticsearch-rest-high-level-client

Spring Boot 集成 Elasticsearch Rest High Level Client 示例。

## 主要功能
- 通过 RestHighLevelClient 实现文档索引和查询

## 运行与验证
1. 启动本地 Elasticsearch 服务（默认 9200 端口）
2. 启动项目（端口 8095）
3. 访问接口：
   - `POST /es-rest/save` 保存文档（body 传 JSON）
   - `GET /es-rest/get/{id}` 查询文档 