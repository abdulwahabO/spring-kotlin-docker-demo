## About

A simple Spring Boot CRUD API written in Kotlin which can be deployed as a Docker container.

**How to run the app**

First, use `./mvnw clean install` to build the project. Then if you have Docker setup on your system build an image 
using `docker build -t <name> .` and run it with `docker run -p 8080:8080 <name>` 

Alternatively, after `./mvnw clean install`, the executable JAR can be run directly using 
`java -jar target/simple-kotlin-api-0.0.1.jar`
 
Use an API client like Insomnia or POSTMAN to call `localhost:8080/log/view` and view sample data.
 
 ### Stack
 
 * JDK 8
 * Kotlin
 * Spring Boot
 * Maven
 * Docker
 