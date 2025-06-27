# 使用官方 OpenJDK 作为基础镜像
FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/nateshao-demo-docker-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"] 