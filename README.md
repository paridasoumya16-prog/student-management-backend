# Student Management System

A backend application built using Java, Spring Boot, MySQL, and Spring Data JPA. This project provides REST APIs to manage student records efficiently.

## Features

- Add a new student
- Get all students
- Get student by ID
- Update student details
- Delete student records
- MySQL database integration
- RESTful API architecture

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok

## Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
└── resources
```

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|----------|
| POST | /students | Add Student |
| GET | /students | Get All Students |
| GET | /students/{id} | Get Student By ID |
| PUT | /students/{id} | Update Student |
| DELETE | /students/{id} | Delete Student |

## Database Configuration

Update your database credentials in:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=your_password
```

## Future Enhancements

- Course Management
- Student-Course Mapping
- Authentication & Authorization
- Swagger Documentation
- Docker Support

## Author

Soumya Ranjana Parida

GitHub: https://github.com/paridasoumya16-prog
