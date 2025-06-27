# nateshao-demo-async

Spring Boot 异步任务（@Async）示例。

## 主要功能
- 使用 @Async 注解实现异步方法

## 运行与验证
1. 启动项目（端口 8085）
2. 访问接口：
   - `GET /async?name=hello` 返回"异步任务已提交"，日志中可看到异步任务的执行过程 