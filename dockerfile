# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml .
COPY mvnw .
COPY mvnw.cmd .
COPY .mvn ./.mvn
COPY src ./src

# Install dependencies
RUN chmod +x mvnw  # Ensure mvnw is executable
RUN ./mvnw clean package -DskipTests

# Use a smaller base image for the final image
FROM openjdk:17-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]