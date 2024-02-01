# Spring Boot CRUD Project

## Overview

A Spring Boot project for beginners, providing CRUD examples with a focus on Test-Driven Development (TDD). The project follows the principles taught in the course [Building a REST API with Spring Boot](https://spring.academy/courses/building-a-rest-api-with-spring-boot).

## Tech Stack

- Java 17
- Spring Boot 3.2.1
- H2 Database

## Features

- CRUD operations (Create, Read, Update, Delete) for CashCard entities
- Utilizes Spring Security for authentication
- Test-Driven Development (TDD) methodology followed during development

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/mihrinurgrn/spring-boot-crud-example
```

2. Navigate to the project directory
```bash
cd  spring-boot-crud-example
```

3. Run the Spring Boot application using Gradle:
```bash
./gradlew bootRun
```

## Endpoints
###Get CashCard by ID
```http
GET /cashcards/{requestedId}
```
Retrieve details of a CashCard by ID.

###Create CashCard
```http
POST /cashcards
```
Create a new CashCard.

###Get All CashCards
```http
GET /cashcards
```
Retrieve a list of all CashCards.


###Update CashCard by ID

```http
PUT /cashcards/{requestedId}
```
Update details of a CashCard by ID.

###Delete CashCard by ID
```http
DELETE /cashcards/{id}
```
Delete a CashCard by ID.

The project uses H2 Database for data storage, which is an in-memory database.