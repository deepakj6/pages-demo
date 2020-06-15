#FROM adoptopenjdk:11-jre-openj9 AS builder
#WORKDIR target/dependency
#ARG APPJAR=build/libs/*.jar
#COPY ${APPJAR} app.jar
#RUN jar -xf ./app.jar

FROM adoptopenjdk:11-jre-openj9
RUN ls pages -R

RUN mkdir /opt/app
#ARG APPJAR=build/libs/*.jar

ARG APPJAR=/pages/build/libs/pages.jar
COPY ${APPJAR} /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]


