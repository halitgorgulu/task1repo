FROM openjdk:11
ADD target/task1.jar task1.jar
ENTRYPOINT ["java", "-jar", "task1.jar"]