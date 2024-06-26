FROM eclipse-temurin:17-jre-alpine

RUN mkdir /app

COPY target/*.jar /app/bill-pay.jar

CMD java -jar /app/bill-pay.jar
