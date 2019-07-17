FROM openjdk:11-jdk-stretch
ADD target/recommendation-0.0.1-SNAPSHOT.jar /src/main/recommendation-0.0.1-SNAPSHOT.jar
WORKDIR /src/main
ENTRYPOINT ["java","-jar","recommendation-0.0.1-SNAPSHOT.jar"]