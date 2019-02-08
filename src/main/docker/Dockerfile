FROM openjdk:8-jre-alpine

WORKDIR /root

ADD src/main/docker/entrypoint.sh entrypoint.sh
RUN chmod 755 ./entrypoint.sh

ADD target/*.jar app.jar

# entrypoint.sh doesn't work for some reason
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

EXPOSE 8080