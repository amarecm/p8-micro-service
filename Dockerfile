FROM registry.access.redhat.com/ubi8/openjdk-17
#LABEL MAINTAINER = "AMARENDAR.MIRYALA"

USER root
RUN mkdir -p /logs

#WORKDIR /app


COPY target/openshift-micro-service-0.0.1-SNAPSHOT.jar app.jar
#COPY target/*.jar app.jar

EXPOSE 8080

#CMD [ "java", "-jar", "app.jar" ]
ENTRYPOINT [ "java", "-jar", "app.jar" ]
