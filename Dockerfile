FROM openjdk:8
WORKDIR /
ADD /target/operaciones-aritmeticas-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
ENTRYPOINT [ "java","-jar","operaciones-aritmeticas-0.0.1-SNAPSHOT.jar" ]