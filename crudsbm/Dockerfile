#Build
FROM gradle:jdk17-alpine as builder

RUN mkdir app && \
    cd app
WORKDIR /app
COPY . .
RUN gradle bootJar

# Runtime
FROM openjdk:17-jdk-slim

COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]