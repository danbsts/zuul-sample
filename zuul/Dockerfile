FROM openjdk:8-jdk-slim
VOLUME /tmp
COPY target/zuul-*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
