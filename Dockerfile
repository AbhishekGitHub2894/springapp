FROM maven:latest as build-env
COPY . /app
WORKDIR /app
RUN mvn package
RUN ls /app/target/

FROM openjdk:8-jdk-alpine
EXPOSE 80
COPY --from=build-env /app/target/*.jar /app.jar
CMD java -jar app.jar

