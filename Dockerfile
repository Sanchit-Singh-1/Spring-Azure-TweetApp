FROM openjdk:8
EXPOSE 8081
COPY target/spring-boot-docker.jar spring-boot-docker.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-docker.jar"] 
