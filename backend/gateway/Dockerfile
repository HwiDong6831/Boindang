FROM amazoncorretto:17
ARG JAR_FILE=./build/libs/gateway-0.0.1-SNAPSHOT.jar
WORKDIR /app
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]
