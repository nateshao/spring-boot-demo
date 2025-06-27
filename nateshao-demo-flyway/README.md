# nateshao-demo-flyway

Spring Boot 集成 Flyway 数据库迁移示例。

## 主要功能
- 启动时自动执行 db/migration 下的 SQL 脚本

## 运行与验证
1. 配置好本地 MySQL 数据库
2. 启动项目（端口 8098）
3. 启动后数据库会自动创建 flyway_demo 表
4. 访问接口：
   - `GET /flyway` 返回"Flyway migration success!" 