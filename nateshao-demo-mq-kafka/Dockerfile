# 基于官方OpenJDK镜像
FROM openjdk:8-jdk-alpine

# 作者信息
LABEL maintainer="nateshao <nateshao@gmail.com>"

# 应用jar包名
ARG JAR_FILE=target/nateshao-demo-mq-kafka-0.0.1-SNAPSHOT.jar

# 复制jar包到容器
COPY ${JAR_FILE} app.jar

# 暴露端口
EXPOSE 8080

# 启动应用
ENTRYPOINT ["java", "-jar", "app.jar"] 