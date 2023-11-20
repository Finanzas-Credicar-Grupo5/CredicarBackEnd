FROM openjdk:20-jdk-oracle
VOLUME [ "/tmp" ]
EXPOSE 8080
ADD ./target/backend.jar backend-aws1.jar
ENTRYPOINT ["java", "-jar", "/backend-aws1.jar"]


