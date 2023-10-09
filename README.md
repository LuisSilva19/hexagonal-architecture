# Spring backend application template with Hexagonal architecture

## Development

### Setup

1. Download and setup JDK 17.
2. Download Maven dependency manager: [Maven Download](https://maven.apache.org/download.cgi)  
3. Run maven command in the project's root folder: `mvn clean install`


### Database

At first we are using an embedded H2 database without using a schema manager (Liquibase)

After the application starts, H2 developer console is available on the following URL:
http://localhost:8080/h2-console    
In order to connect, provide the necessary information, which can be find in `application-local.properties` file.

### Run


Run the application from IDEA: `application.controller.src.main.java.ApplicationController`  
   or from command-line: `mvn spring-boot:run`

## Features

This template contains the following features:
- Already arranged hexagonal architecture
- Minimalist exception handling (it handles exceptions thrown by validation API as well)
[//]: # (- OpenAPI configuration &#40;although it's not working, bcz Spring Boot v3 is not supported yet&#41;)
- GitHub workflow to build the project
