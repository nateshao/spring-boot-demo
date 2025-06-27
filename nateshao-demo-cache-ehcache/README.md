# nateshao-demo-cache-ehcache

Spring Boot 集成 Ehcache 缓存示例。

## 主要功能
- 使用 @Cacheable 注解实现本地缓存
- 缓存配置见 resources/ehcache.xml

## 运行与验证
1. 启动项目（端口 8086）
2. 访问接口：
   - `GET /ehcache?name=hello` 多次访问，60 秒内返回内容时间戳不变，说明缓存生效 