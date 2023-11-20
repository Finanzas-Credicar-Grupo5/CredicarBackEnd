FROM openjdk:17.0.2-jdk-oracle
VOLUME [ "/tmp" ]
EXPOSE 8080
ADD ./target/backend.jar backend-aws1.jar
ENTRYPOINT ["java", "-jar", "/backend-aws1.jar"]

