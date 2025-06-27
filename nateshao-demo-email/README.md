# nateshao-demo-email

Spring Boot 集成邮件发送（QQ邮箱为例）示例。

## 主要功能
- 通过 spring-boot-starter-mail 实现简单邮件发送

## 运行与验证
1. 配置好 QQ 邮箱和授权码
2. 启动项目（端口 8096）
3. 访问接口：
   - `POST /email/send?to=xxx@qq.com&subject=测试&content=内容` 