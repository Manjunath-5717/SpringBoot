# 🌱 Spring Boot Learning Repository

Welcome to my **Spring Boot Learning Repository** 🚀

This repository contains my hands-on practice, examples, and projects while learning **Spring Boot and Java Backend Development**.

The goal of this repository is to understand Spring Boot concepts by implementing them through practical applications.

---

## 📚 Topics Covered

### 🔹 Spring Boot Basics
- Spring Boot Project Setup
- Application Properties
- Embedded Tomcat
- Dependency Injection
- `@Component`
- `@Service`
- `@Repository`
- `@RestController`

### 🔹 REST API
- GET API
- POST API
- Request Mapping
- Path Variables
- Request Parameters
- Request Body
- `ResponseEntity`
- HTTP Status Codes

### 🔹 Spring Data JPA
- JPA Configuration
- Entity Mapping
- `@Entity`
- `@Table`
- `@Id`
- Repository
- `JpaRepository`
- Custom Query Methods

### 🔹 PostgreSQL
- PostgreSQL Database Connection
- Database Configuration
- Tables
- CRUD Operations
- Spring Boot + PostgreSQL Integration

### 🔹 Validation
- Request Validation
- `@Valid`
- Validation Annotations
- Handling Validation Errors

### 🔹 Exception Handling
- Custom Exceptions
- `@ExceptionHandler`
- `@RestControllerAdvice`
- Global Exception Handling
- `UserNotFoundException`

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Operations |
| Hibernate | ORM |
| PostgreSQL | Database |
| Maven | Build & Dependency Management |
| IntelliJ IDEA | IDE |
| Git & GitHub | Version Control |

---

## 📂 Project Structure

```text
src
└── main
    └── java
        └── com.javatech.validationexample
            ├── advice
            │   └── ApplicationExceptiohandle.java
            │
            ├── controller
            │   └── UserController.java
            │
            ├── dto
            │   └── UserRequest.java
            │
            ├── entity
            │   └── User.java
            │
            ├── exception
            │   └── UserNotFoundException.java
            │
            ├── repository
            │   └── UserRepository.java
            │
            └── service
                └── UserService.java
