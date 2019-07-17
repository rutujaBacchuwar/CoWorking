FROM openjdk:11-jdk-stretch

WORKDIR /src/app

ADD target/login-service-0.0.1-SNAPSHOT.jar login-service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","login-service-0.0.1-SNAPSHOT.jar"]