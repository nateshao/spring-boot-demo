# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)


## [官方文档](https://www.diboot.com/guide/diboot-devtools/%E5%BC%80%E5%A7%8B%E4%BD%BF%E7%94%A8.html#_2-%E5%BC%95%E5%85%A5%E4%BE%9D%E8%B5%96)

# nateshao-demo-docker

Spring Boot 项目 Docker 容器化示例。

## 构建与运行

1. 打包项目
   ```bash
   mvn clean package -DskipTests
   ```
2. 构建镜像
   ```bash
   docker build -t nateshao-demo-docker .
   ```
3. 运行容器
   ```bash
   docker run -d -p 8090:8090 --name nateshao-demo-docker nateshao-demo-docker
   ```

## 访问

浏览器访问 [http://localhost:8090/hello](http://localhost:8090/hello)
