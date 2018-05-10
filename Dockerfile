FROM openjdk:8-jdk-alpine
RUN mkdir -p /root/workspace/project
WORKDIR /root/workspace/project
COPY build/libs/*.jar app.jar
#RUN set -ex && ./gradlew build
#RUN cp build/libs/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/root/workspace/project/app.jar"]