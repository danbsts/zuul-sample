FROM openjdk:8-jdk-slim
WORKDIR /api
COPY build/libs/fibonacci-api-0.1-all.jar ./api.jar
CMD ["java", "-jar", "api.jar"]
