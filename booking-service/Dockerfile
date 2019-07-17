FROM openjdk:11-jdk-stretch
ADD target/payment-service-0.0.1-SNAPSHOT.jar /src/main/payment-service-0.0.1-SNAPSHOT.jar
WORKDIR /src/main
ENTRYPOINT ["java","-jar","payment-service-0.0.1-SNAPSHOT.jar"]

