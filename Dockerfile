FROM registry.access.redhat.com/ubi8/openjdk-17 as build
WORKDIR /app
COPY . .
RUN mvn install

FROM registry.access.redhat.com/ubi8/openjdk-17
WORKDIR /app
COPY --from=build /app/target/openshift-micro-service-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]
