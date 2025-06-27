# nateshao-demo-cache-redis

Spring Boot 集成 Redis 缓存示例。

## 主要功能
- 使用 @Cacheable 注解实现分布式缓存
- 依赖本地 Redis 服务

## 运行与验证
1. 启动本地 Redis 服务（默认端口 6379）
2. 启动项目（端口 8087）
3. 访问接口：
   - `GET /redis-cache?name=hello` 多次访问，返回内容时间戳不变，说明缓存生效 