FROM openjdk:8
EXPOSE 8099
ADD target/docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar"]
