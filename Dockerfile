FROM openjdk:8
EXPOSE 8089
ADD /target/gestionCondidat-0.0.1-SNAPSHOT.jar gestionCondidat-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","gestionCondidat-0.0.1-SNAPSHOT.jar"]
