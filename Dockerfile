FROM openjdk:8
EXPOSE 9090
ADD target/aws.war aws.war
ENTRYPOINT ["java", "-jar", "/aws.war"]