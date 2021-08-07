FROM openjdk:8-jdk-alpine
MAINTAINER longpc.com
COPY target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-docker-0.0.1-SNAPSHOT.jar"]