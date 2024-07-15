# Spring6 Reactive WebFlux REST backend web application for UPPERCASE band

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/markdeleon01/spring6-webflux-h2-uppercaseband-webapp/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/markdeleon01/spring6-webflux-h2-uppercaseband-webapp/tree/main)

[![codecov](https://codecov.io/github/markdeleon01/spring6-webflux-h2-uppercaseband-webapp/graph/badge.svg?token=M2LUDXXSS1)](https://codecov.io/github/markdeleon01/spring6-webflux-h2-uppercaseband-webapp)

This repository is for a RESTful web application built on Spring6 Reactive WebFlux Framework for my band's website.

This is a Spring Boot 3 web application that serves up articles regarding the UPPERCASE band.

The articles are categorized and displayed according to the various sections of the website,
such as highlights on the home page, events, discography section, and band information section;
they are stored and retrieved from an embedded H2 R2DBC database.

The article resources are exposed with the API route:
http://localhost:8080/api/v1/articles

JUnit5 tests were written to assert functionalities of the repository, service, and controller classes.


## Project setup

1. Install Java SE 17 LTS:
   https://www.oracle.com/java/technologies/downloads/#java17
2. Install Apache Maven:
   https://maven.apache.org/download.cgi
3. Clone this project repository
4. Navigate to the project folder and install
   ```sh
   mvn compile
   mvn test
   mvn package
   ```
5. Run the web application
   ```sh
   java -jar target/spring6-reactive-uppercaseband-webapp-0.0.1-SNAPSHOT.jar
   ```
6. Open a browser window and navigate to: http://localhost:8080/api/v1/articles
7. Download the Postman desktop app:  https://www.postman.com
8. Open the Swagger UI / Open API definition:  http://localhost:8080/swagger-ui.html