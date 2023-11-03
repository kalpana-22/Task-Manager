# Task-Manager
The "Full-Stack Web Application" is a project developed with Spring Boot as its backend. It empowers users to efficiently manage their task lists. This application provides a user-friendly interface for creating, tracking, and organizing tasks, enhancing productivity and organization in daily activities.

## Project Initialization

This project was initialized using Spring Initializer, and it is a Spring Boot web application developed with Maven and Java 11.

## Prerequisites

Make sure you have the following software installed on your system:

- Java 11 or higher
- Apache Maven
- IntelliJ IDEA 2022.2.1 (Ultimate Edition)

## Getting Started

Follow these steps to set up and run the project on your local machine:

1. Clone this repository:

   ```bash
   git clone https://github.com/kalpana-22/Task-Manager.git

## Build the project using Maven:

mvn clean install

## Access the application in your web browser:

http://localhost:8080

## some API with sample values

http://localhost:8080/tasks/userId?userId=1
http://localhost:8080/tasks/type/Todo
http://localhost:8080/tasks/update
http://localhost:8080/tasks/remove?id=4
http://localhost:8080/tasks/allTasks
http://localhost:8080/user/userId?userId=1
http://localhost:8080/tasks/add

## Features
Create tasks
Update task details
Change tasks as details
Delete tasks
Filter tasks by status (All, Todo, In Progress, Completed)
View a list of tasks

## Technologies Used
Spring Boot
Spring Web
Thymeleaf (for frontend templating)
H2 Database (for development)
Maven
Java 11
Spring Data JPA

## Contributors
Kalpana Imbuldeniya - Project Lead
