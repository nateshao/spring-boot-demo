# spring-boot-demo(SpringBoot深度学习并实战)

<h1 align="center"><a href="https://github.com/nateshao" target="_blank">Spring Boot Test</a></h1>
<p align="center">
  <a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html"><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8.0_162-orange.svg"/></a>
  <a href="https://docs.spring.io/spring-boot/docs/2.1.0.RELEASE/reference/html/"><img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-2.1.0.RELEASE-brightgreen.svg"/></a>
</p>

## 项目简介

`spring-boot-demo` 是一个用来深度学习并实战 `spring boot` 的项目，目前总共包含 **`66`** 个集成demo，已经完成 **`17`**个。

该项目已成功集成 actuator(`监控`)、admin(`可视化监控`)、logback(`日志`)、aopLog(`通过AOP记录web请求日志`)、统一异常处理(`json级别和页面级别`)、freemarker(`模板引擎`)、thymeleaf(`模板引擎`)、Beetl(`模板引擎`)、Enjoy(`模板引擎`)、JdbcTemplate(`通用JDBC操作数据库`)、JPA(`强大的ORM框架`)、mybatis(`强大的ORM框架`)、通用Mapper(`快速操作Mybatis`)、PageHelper(`通用的Mybatis分页插件`)、mybatis-plus(`快速操作Mybatis`)、BeetlSQL(`强大的ORM框架`)、upload(`本地文件上传和七牛云文件上传`)、redis(`缓存`)、ehcache(`缓存`)、email(`发送各种类型邮件`)、task(`基础定时任务`)、quartz(`动态管理定时任务`)、xxl-job(`分布式定时任务`)、swagger(`API接口管理测试`)、security(`基于RBAC的动态权限认证`)、SpringSession(`Session共享`)、Zookeeper(`结合AOP实现分布式锁`)、RabbitMQ(`消息队列`)、Kafka(`消息队列`)、websocket(`服务端推送监控服务器运行信息`)、socket.io(`聊天室`)、ureport2(`中国式报表`)、打包成`war`文件、集成 ElasticSearch(`基本操作和高级查询`)、Async(`异步任务`)、集成Dubbo(`采用官方的starter`)、MongoDB(`文档数据库`)、neo4j(`图数据库`)、docker(`容器化`)、`JPA多数据源`、`Mybatis多数据源`、`代码生成器`、GrayLog(`日志收集`)、JustAuth(`第三方登录`)、LDAP(`增删改查`)、`动态添加/切换数据源`、单机限流(`AOP + Guava RateLimiter`)、分布式限流(`AOP + Redis + Lua`)、ElasticSearch 7.x(`使用官方 Rest High Level Client`)、HTTPS、Flyway(`数据库初始化`)。

## 开发环境

- **JDK 1.8 +**
- **Maven 3.5 +**
- **IntelliJ IDEA ULTIMATE 2020.1 +** (*注意：务必使用 IDEA 开发，同时保证安装 `lombok` 插件*)
- **Mysql 5.7 +** (*尽量保证使用 5.7 版本以上，因为 5.7 版本加了一些新特性，同时不向下兼容。本 demo 里会尽量避免这种不兼容的地方，但还是建议尽量保证 5.7 版本以上*)

## 运行方式

> 提示：如果是 fork 的朋友，同步代码的请参考：

1. `git clone ..`
2. 使用 IDEA 打开 clone 下来的项目
3. 在 IDEA 中 Maven Projects 的面板导入项目根目录下 的 `pom.xml` 文件
4. Maven Projects 找不到的童鞋，可以勾上 IDEA 顶部工具栏的 View -> Tool Buttons ，然后 Maven Projects 的面板就会出现在 IDEA 的右侧
5. 找到各个 Module 的 Application 类就可以运行各个 demo 了
6. **`注意：每个 demo 均有详细的 README 配套，食用 demo 前记得先看看哦~`**
7. **`注意：运行各个 demo 之前，有些是需要事先初始化数据库数据的，亲们别忘记了哦~`**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <packaging>pom</packaging>
    <modules>
        <module>nateshao-demo-async</module>
        <module>nateshao-demo-activiti</module>
        <module>nateshao-demo-actuator</module>
        <module>nateshao-demo-admin</module>
        <module>nateshao-demo-admin/demo-client</module>
        <module>nateshao-demo-admin/demo-server</module>
        <module>nateshao-demo-cache-redis</module>
        <module>nateshao-demo-cache-ehcache</module>
        <module>nateshao-demo-docker</module>
        <module>nateshao-demo-codegen</module>
        <module>nateshao-demo-elasticsearch</module>
        <module>nateshao-demo-elasticsearch-rest-high-level-client</module>
        <module>nateshao-demo-dynamic-datasource</module>
        <module>nateshao-demo-dubbo</module>
        <module>nateshao-demo-logback</module>
        <module>nateshao-demo-log-aop</module>
        <module>nateshao-demo-ldap</module>
        <module>nateshao-demo-https</module>
        <module>nateshao-demo-helloworld</module>
        <module>nateshao-demo-graylog</module>
        <module>nateshao-demo-flyway</module>
        <module>nateshao-demo-exception-handler</module>
        <module>nateshao-demo-email</module>
        <module>nateshao-demo-neo4j</module>
        <module>nateshao-demo-multi-datasource-mybatis</module>
        <module>nateshao-demo-multi-datasource-jpa</module>
        <module>nateshao-demo-mq-rocketmq</module>
        <module>nateshao-demo-mq-rabbitmq</module>
        <module>nateshao-demo-mq-kafka</module>
        <module>nateshao-demo-mongodb</module>
        <module>nateshao-demo-orm-mybatis-plus</module>
        <module>nateshao-demo-orm-mybatis-mapper-page</module>
        <module>nateshao-demo-orm-jpa</module>
        <module>nateshao-demo-orm-jdbctemplate</module>
        <module>nateshao-demo-orm-beetlsql</module>
        <module>nateshao-demo-oauth</module>
        <module>nateshao-demo-orm-mybatis</module>
        <module>nateshao-demo-properties</module>
        <module>nateshao-demo-pay</module>
        <module>nateshao-demo-ratelimit-guava</module>
        <module>nateshao-demo-ratelimit-redis</module>
        <module>nateshao-demo-rbac-security</module>
        <module>nateshao-demo-rbac-shiro</module>
        <module>nateshao-demo-session</module>
        <module>nateshao-demo-sharding-jdbc</module>
        <module>nateshao-demo-social</module>
        <module>nateshao-demo-swagger</module>
        <module>nateshao-demo-swagger-beauty</module>
        <module>nateshao-demo-task</module>
        <module>nateshao-demo-task-quartz</module>
        <module>nateshao-demo-task-xxl-job</module>
        <module>nateshao-demo-template-beetl</module>
        <module>nateshao-demo-template-enjoy</module>
        <module>nateshao-demo-template-freemarker</module>
        <module>nateshao-demo-template-thymeleaf</module>
        <module>nateshao-demo-tio</module>
        <module>nateshao-demo-uflo</module>
        <module>nateshao-demo-upload</module>
        <module>nateshao-demo-ureport2</module>
        <module>nateshao-demo-urule</module>
        <module>nateshao-demo-war</module>
        <module>nateshao-demo-websocket</module>
        <module>nateshao-demo-websocket-socketio</module>
        <module>nateshao-demo-zookeeper</module>
        <module>nateshao-demo-diboot</module>
    </modules>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.1</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.nateshao</groupId>
    <artifactId>nateshao-boot-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>nateshao-boot-demo</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

# 正在加紧完善中....

## 赞助作者买个馒头吧💚

| 支付宝                                                       | 微信                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| <img width="200" height="200" src="https://nateshao.gitee.io/medias/reward/alipay.jpg"/> | <img width="200" height="200" src="https://nateshao.gitee.io/medias/reward/wechat.png"/> |


