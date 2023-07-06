FROM java:8
#EXPOSE 8082
ADD ./target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","api-0.0.1-SNAPSHOT.jar"]