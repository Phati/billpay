FROM eclipse-temurin:17-jre-alpine

RUN mkdir /app

COPY target/*.jar /app/app.jar

CMD java -jar /app/app.jar
