FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkings-integrations-sample.jar docker-jenkings-integrations-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkings-integrations-sample.jar"]
