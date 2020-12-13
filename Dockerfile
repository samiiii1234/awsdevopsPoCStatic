FROM openjdk:8
EXPOSE 8080
ADD target/aws.war aws.war
ENTRYPOINT ["java", "-jar", "/aws.war"]