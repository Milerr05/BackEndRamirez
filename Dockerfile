FROM amazoncorretto: 17-alpine-jdk         
MAINTAINER MilenaRamirez
COPY target/ramirez-0.0.1-SNAPSHOT.jar  ramirez-app.jar     
ENTRYPOINT ["java","-jar","/ramirez-app.jar"]                 
