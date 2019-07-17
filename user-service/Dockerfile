FROM openjdk:11-jdk-stretch
ADD target/user-service-1.0-SNAPSHOT.jar /src/main/user-service-1.0-SNAPSHOT.jar
WORKDIR /src/main
ENTRYPOINT ["java","-jar","user-service-1.0-SNAPSHOT.jar"]