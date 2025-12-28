# JWT Authentication System

A robust Spring Boot application implementing JSON Web Token (JWT) based authentication and authorization.

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── jwtauthsystem
│   │               ├── JwtAuthSystemApplication.java  # Main Entry Point
│   │               ├── auth                           # Authentication Logic
│   │               │   ├── AuthenticationController.java
│   │               │   ├── AuthenticationRequest.java
│   │               │   ├── AuthenticationResponse.java
│   │               │   ├── AuthenticationService.java
│   │               │   └── RegisterRequest.java
│   │               ├── config                         # Security Configuration
│   │               │   ├── ApplicationConfig.java
│   │               │   ├── JwtAuthenticationFilter.java
│   │               │   ├── JwtService.java
│   │               │   └── SecurityConfig.java
│   │               └── user                           # User Management
│   │                   ├── Role.java
│   │                   ├── User.java
│   │                   ├── UserController.java
│   │                   └── UserRepository.java
│   └── resources
│       └── application.properties                     # App Config (H2, logging)
└── test                                               # Unit/Integration Tests
```

## 🚀 Features

*   **User Registration**: Create new accounts with secure password hashing (BCrypt).
*   **User Login**: Authenticate and receive a JWT access token.
*   **Data Persistence**: Uses H2 in-memory database (configurable to MySQL/Postgres).
*   **Role-Based Access**: Role support (USER/ADMIN) built into the entity model.
*   **Protected Routes**: Secure endpoints requiring valid Bearer tokens.

## 🛠️ Tech Stack

*   **Java 17**
*   **Spring Boot 3.2.0**
*   **Spring Security 6**
*   **JSON Web Token (jjwt-api 0.11.5)**
*   **Spring Data JPA**
*   **H2 Database**
*   **Lombok**
*   **Maven**

## 🏃‍♂️ How to Run

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/sahana196/jwt-auth-system.git
    cd jwt-auth-system
    ```

2.  **Build and Run**:
    ```bash
    mvn spring-boot:run
    ```

3.  **API Endpoints**:
    The server starts at `http://localhost:8080`.

    *   **Register**: `POST /api/auth/register`
        ```json
        {
          "firstname": "John",
          "lastname": "Doe",
          "email": "john@mail.com",
          "password": "password"
        }
        ```
    *   **Login**: `POST /api/auth/authenticate`
        ```json
        {
          "email": "john@mail.com",
          "password": "password"
        }
        ```
    *   **Protected Profile**: `GET /api/user/profile`
        *   Header: `Authorization: Bearer <your_token>`

## 🧪 Testing with PowerShell

**Register:**
```powershell
Invoke-RestMethod -Uri http://localhost:8080/api/auth/register -Method POST -ContentType "application/json" -Body '{"firstname":"John","lastname":"Doe","email":"john@mail.com","password":"password"}'
```

**Login:**
```powershell
Invoke-RestMethod -Uri http://localhost:8080/api/auth/authenticate -Method POST -ContentType "application/json" -Body '{"email":"john@mail.com","password":"password"}'
```
