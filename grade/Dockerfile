FROM openjdk:11
VOLUME /tmp
ADD ./target/grade-0.0.1-SNAPSHOT.jar grade.jar
ENTRYPOINT ["java","-jar","/grade.jar"]