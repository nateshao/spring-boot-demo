# nateshao-demo-cache-redis

本模块演示 Spring Boot 集成 Redis 缓存。

## 主要功能
- 集成 Redis 作为缓存
- 提供缓存读写接口

## 依赖
- spring-boot-starter-data-redis
- spring-boot-starter-cache

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8087/redis-cache?name=test
- 首次访问返回新数据，后续命中缓存

## 主要文件说明
- `RedisCacheDemoService.java`：@Cacheable 缓存服务
- `RedisCacheDemoController.java`：缓存接口
- `application.yml`：Redis 连接与缓存配置

## 验证方式
1. 启动本地 Redis（默认端口 6379）
2. 启动本项目
3. 访问 http://localhost:8087/redis-cache?name=test
4. 首次返回新数据，后续返回缓存数据（时间戳不变） 