FROM openjdk:21
EXPOSE 8080
COPY /build/libs/DockerDemo-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]

