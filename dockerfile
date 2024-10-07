# 1. Use a base image with JDK to build the Spring Boot app
FROM openjdk:17-jdk-alpine AS build

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the Maven build files (pom.xml) to cache dependencies
COPY pom.xml .

# 4. Resolve dependencies
RUN ./mvnw dependency:go-offline

# 5. Copy the source code into the container
COPY src ./src

# 6. Build the application
RUN ./mvnw clean package -DskipTests

# 7. Use a lightweight base image to run the Spring Boot application
FROM openjdk:17-jdk-alpine

# 8. Set the working directory for the final image
WORKDIR /app

# 9. Copy the built JAR file from the build stage
COPY --from=build /app/target/cicd-0.0.1-SNAPSHOT.jar /app/cicd-0.0.1-SNAPSHOT.jar

# 10. Expose the port that the app listens on
EXPOSE 8080

# 11. Command to run the application
ENTRYPOINT ["java", "-jar", "/app/cicd-0.0.1-SNAPSHOT.jar"]
