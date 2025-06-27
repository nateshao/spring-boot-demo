# nateshao-demo-graylog

Spring Boot 集成 Graylog 日志收集示例。

## 主要功能
- 通过 logback-gelf 将日志发送到 Graylog

## 运行与验证
1. 启动本地 Graylog 服务（默认 12201 端口）
2. 启动项目（端口 8099）
3. 访问接口：
   - `GET /graylog`，Graylog 控制台可看到日志 