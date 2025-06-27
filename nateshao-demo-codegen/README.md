# nateshao-demo-codegen

本模块演示 Spring Boot 集成 MyBatis-Plus 代码生成器。

## 主要功能
- 集成 mybatis-plus-generator
- 一键生成实体、Mapper、Service、Controller 等代码

## 依赖
- mybatis-plus-generator
- freemarker
- mysql-connector-java

## 运行方法
```bash
# 运行 main 方法
mvn compile exec:java -Dexec.mainClass="com.nateshao.codegen.CodeGenerator"
```

## 主要文件说明
- `CodeGenerator.java`：代码生成主类
- `application.yml`：数据库连接配置

## 验证方式
1. 配置 application.yml 数据库连接信息，确保有 user 表
2. 运行 CodeGenerator 的 main 方法
3. 查看 src/main/java 目录下是否生成 entity、mapper、service、controller 等代码 