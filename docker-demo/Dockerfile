#Start with a base image containing Java runtime
FROM openjdk:8-jdk-slim as build

#Information around who maintains the image
MAINTAINER harishsahoo21@gmail.com

# Add the application's jar to the container
COPY target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/docker-demo-0.0.1-SNAPSHOT.jar"]
