# demo-spring-boot-docker
# Dockerizing a Spring boot application
## Step 1: we have to create Dockerfile with some config
```
FROM openjdk:8-jdk-alpine
MAINTAINER longpc.com
COPY target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-docker-0.0.1-SNAPSHOT.jar"]
```
## Step 2: we have to change file pom for create jar file
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
