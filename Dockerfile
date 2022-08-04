FROM openjdk:11.0.16-slim
ADD target/task1.jar task1.jar
ENTRYPOINT ["java", "-jar", "task1.jar"]