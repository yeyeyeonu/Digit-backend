# 🐳 Spring Boot용 Dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN ./gradlew build
EXPOSE 8080
CMD ["java", "-jar", "build/libs/*.jar"]
