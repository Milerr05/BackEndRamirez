FROM amazoncorretto:11-alpine-jdk         
MAINTAINER MilenaRamirez
COPY target/Ramirez-0.0.1-SNAPSHOT.jar  ramirez-app.jar     
ENTRYPOINT ["java","-jar","/ramirez-app.jar"]                 
