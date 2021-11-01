# Jubic-Backend-API-Challenge
Application for Jubic Oy's Backend API challenge

## Languages and technologies

- Java
- Spring MVC
- Spring Data JPA
- H2 Database for JDBC (Local "mock" database)

## Usage

When running the program, you can request the licenses with the license ID:
  /api/license/{id}

 eg. on localhost:
  localhost:8080/api/license/1
  
This will return a JSON object as follows:
```JSON
  {
    "id": 1,
    "name": "License1",
    "expiresAt": "2022-01-01",
    "queriedAt": "2021-11-01"
  }
```
