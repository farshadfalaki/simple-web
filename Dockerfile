FROM openjdk:8-jdk-alpine

LABEL maintainer="farshad.falaki@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/simpe-web-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} simple.jar

ENTRYPOINT ["java","-jar","/simple.jar"]