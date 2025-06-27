# 基于官方OpenJDK镜像
FROM openjdk:8-jdk-alpine

LABEL maintainer="nateshao <nateshao@gmail.com>"

ARG JAR_FILE=target/nateshao-demo-mq-rabbitmq-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"] 