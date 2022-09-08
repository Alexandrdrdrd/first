FROM openjdk:17-jdk-alpine
MAINTAINER avdieiev.com
COPY target/first-0.0.1-SNAPSHOT.jar first-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/first-0.0.1-SNAPSHOT.jar"]
