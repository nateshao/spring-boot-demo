# nateshao-demo-email

本模块演示 Spring Boot 集成邮件发送。

## 主要功能
- 集成邮件发送（支持 163、QQ、Gmail 等）
- 提供邮件发送接口

## 依赖
- spring-boot-starter-mail
- spring-boot-starter-web

## 运行方法
```bash
mvn spring-boot:run
```

## 典型接口
- POST http://localhost:8080/email/send?to=xxx@xxx.com&subject=主题&content=内容
- 发送简单文本邮件

## 主要文件说明
- `EmailController.java`：邮件发送接口
- `EmailService.java`：邮件发送服务
- `application.yml`：邮件服务器配置

## 验证方式
1. 配置 application.yml 中的邮箱账号和授权码
2. 启动本项目
3. 发送 POST 请求：
   ```bash
   curl -X POST "http://localhost:8080/email/send?to=xxx@xxx.com&subject=测试&content=hello"
   ```
4. 检查收件箱是否收到邮件 