# REST Consumer Demo

A simple Spring Boot application that demonstrates how to consume external REST APIs. This project specifically showcases:
- Making HTTP requests to external APIs using Spring's RestTemplate
- Building REST endpoints using Spring MVC
- Proper separation of concerns (Controller and Service layers)

## Current Features
- `/api/joke` endpoint that fetches and returns a random joke from an external API

## Technologies Used
- Java 17
- Spring Boot 3.4.3
- Spring MVC
- RestTemplate for HTTP requests

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven

### Running the Application
1. Clone the repository
2. Run the application:
```bash
./mvnw spring-boot:run
```
3. Access the joke endpoint:
```bash
curl http://localhost:8080/api/joke
```

## Project Structure
- `ApiController.java`: REST endpoint definitions
- `ApiService.java`: Service layer handling external API calls
- `RestConsumerDemoApplication.java`: Main application class

## API Documentation
- GET `/api/joke`: Returns a random joke from the external API