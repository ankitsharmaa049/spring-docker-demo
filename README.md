
# Spring Boot App With Docker

### (1) Build an image

$ docker build .   
$ docker build -t <custom_image_name> .  
-t : tags image to the value that follows -t  
dot (.) : It indicates that the Dockerfile is in the current directory.

### (2) List all the container

$ docker ps   
-> list all the running container  
$ docker ps -all/-a  
-> list all the container that have ever created
## (3) Run the container

$ docker run <container_id>  
-> Run the docker container with container id

$ docker run <image_name>  
-> Run the docker container with image name

$ docker run -d <image-name>  
-> Detached Mode
-> Run the docker container in the in the background

$ docker run -it <image> <command-processor>  
-> <command-processor> : sh/bash/powershell etc.  
-> it create and start the container with the shell(interactive Mode) 

$ docker run -p 8080:8090 <container_id>  
-> -p: Port Mapping
-> Mapping local port 8080 with 9090 inside the container 

### (4) Multi-Command container

$docker exec -it <container-id> cmd    
-> Execute an additional cmd inside a running container
-> exec: run another cmd  
-> -it : Allow us to provide input to the container  
-> <cmd>: command to execute

$docker exec -it <cont-id> <command-processor>
-> It is used to start a command prompt inside a running container  
-> Command-Processor: sh, powershell, zsh, bash

### (4) Docker Compose

$ docker-compose version
-> return the version of Docker Compose.

$ docker-compose build  
-> Build a docker image with docker-compose.yml file

$ docker-compose up     
-> This command is used to build and run docker containers mention in the docker-compose.yml at the same time

$ docker-compose up --build  
-> Rebuild and Run a docker image with docker-compose.yml file

$ docker compose up -d  
-> It is used to build and run docker containers in the background.

$ docker compose down
This command is used to stop the running containers 




