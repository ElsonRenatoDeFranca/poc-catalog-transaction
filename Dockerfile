FROM eclipse-temurin:17-jre-focal
WORKDIR /app
COPY target/crm-microservice-docker.jar /app/crm-microservice-docker.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar","crm-microservice-docker.jar"]