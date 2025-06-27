# nateshao-demo-cache-ehcache

本模块演示 Spring Boot 集成 Ehcache 缓存。

## 主要功能
- 集成 Ehcache 作为本地缓存
- 提供缓存读写接口

## 依赖
- spring-boot-starter-cache
- spring-boot-starter-web
- ehcache

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- GET http://localhost:8086/ehcache?name=test
- 首次访问返回新数据，后续命中缓存

## 主要文件说明
- `EhcacheDemoService.java`：@Cacheable 缓存服务
- `EhcacheDemoController.java`：缓存接口
- `application.yml`：Ehcache 缓存配置
- `ehcache.xml`：Ehcache 策略配置

## 验证方式
1. 启动本项目
2. 访问 http://localhost:8086/ehcache?name=test
3. 首次返回新数据，后续返回缓存数据（时间戳不变，60秒后失效） 