FROM openjdk:11
VOLUME /tmp
ADD ./target/student-0.0.1-SNAPSHOT.jar student.jar
ENTRYPOINT ["java","-jar","/student.jar"]