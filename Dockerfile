FROM openjdk:8


RUN mkdir -p /usr/src/app
COPY target/spring-docker-demo-0.0.1-SNAPSHOT.jar /usr/src/app

WORKDIR /usr/src/app

ENTRYPOINT /bin/bash -c 'java -Ddocker.instance.id=$HOSTNAME -jar spring-docker-demo-0.0.1-SNAPSHOT.jar'