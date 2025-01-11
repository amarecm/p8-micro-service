# Build the application first using Maven
FROM maven:3.8.3-openjdk-17 as build

USER root
RUN mkdir -p /logs

WORKDIR /app
COPY . .
RUN mvn install

# Inject the JAR file into a new container to keep the file small
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/openshift-micro-service-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]
