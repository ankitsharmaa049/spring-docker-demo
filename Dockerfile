#Specify a base image
FROM openjdk:11

EXPOSE 5000

#Set the working directory inside the container for all the subsequent Dockerfile instructions
#WORKDIR '/app'

#Define the name of a parameter and its default value
ARG JAR_FILE=build/spring-docker-demo.jar

#Copy jar file into container as spring-docker-demo.jar
COPY ${JAR_FILE} spring-docker-demo.jar

#This commmand will execute once docker image is created
ENTRYPOINT ["java","-jar","spring-docker-demo.jar"]

