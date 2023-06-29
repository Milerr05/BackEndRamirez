FROM amazoncorretto: 17-alpine-jdk          // de que imagen partimos
MAINTAINER MilenaRamirez //quien es el dueño
COPY target/ramirez-0.0.1-SNAPSHOT.jar  ramirez-app.jar     //va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar","/ramirez-app.jar"]                 //es la instruccion que se va a ejecutar primero
