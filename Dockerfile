FROM openjdk:8
ADD target/librarymanagement-0.0.1-SNAPSHOT.jar librarymanagement-app.jar
ENTRYPOINT ["java", "-jar", "librarymanagement-app.jar"]