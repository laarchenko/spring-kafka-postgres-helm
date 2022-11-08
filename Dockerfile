FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine
ENV spring-datasource-url $spring-datasource-url
ADD target/newDemo-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","newDemo-0.0.1-SNAPSHOT.jar"]
