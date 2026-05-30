# ---------- Stage 1: Build ----------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy only pom.xml first (better cache usage)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code and build jar
COPY src ./src
RUN mvn clean package -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy built jar from previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
