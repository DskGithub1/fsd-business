# Use Amazon Corretto 17 as base image
FROM amazoncorretto:17-alpine-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY fsd-loan-business-1.0.1.jar /app/app.jar

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
