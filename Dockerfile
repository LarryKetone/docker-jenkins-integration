FROM openjdk:8
EXPOSE 9093 27017
ADD target/docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.profiles.active=sandbox","-jar","/docker-jenkings-integrations-sample-1.0-SNAPSHOT.jar"]
