# demo-spring-boot-docker
# Dockerizing a Spring boot application
## Step 1: We have to create Dockerfile with some config
```
FROM openjdk:8-jdk-alpine
MAINTAINER longpc.com
COPY target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-docker-0.0.1-SNAPSHOT.jar"]
```
## Step 2: We have to change file pom for create jar file
```
<build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <mainClass>com.longpc.demo.demodocker.DemoDockerApplication</mainClass>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```
## Step 3: Use cmd to build jar by maven command:
```
mvn package spring-boot:repackage
```
## Step 4: Use cmd to build an image by docker:
```
docker build {folder-name} -t username dockerhub/name-images
```
## Step 5: Run image by docker desktop or cmd:
```
docker run --publish 8080:8080 image_name
```

