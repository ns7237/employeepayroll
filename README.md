Spring Boot Employee Payroll Application
Welcome to the Employee Payroll application built with Spring Boot. This project demonstrates the use of REST APIs to perform CRUD operations for managing employee payroll data.

Table of Contents
Overview

Technologies Used

Features

Project Structure

API Endpoints

Overview
The Employee Payroll backend allows you to store, update, retrieve, and delete employee data such as name and salary using RESTful APIs. This application showcases Spring Boot principles including layered architecture, DTO usage, validation, and basic in-memory data handling. Future extensions may include MySQL integration and advanced features.

Technologies Used
Java 11+

Spring Boot

Spring Web

Lombok

Maven

(Planned) MySQL Database

(Planned) Spring Data JPA

Features
Add, update, delete, and retrieve employee payroll records

RESTful API implementation using @RestController

Layered architecture with Controller, Service, and Model layers

DTOs used for data transfer and validation

Data temporarily stored in a list (in-memory)

CURL commands used for testing endpoints

Project Structure
model – Defines the core EmployeePayroll entity

dto – Contains DTOs with fields like name and salary

controller – Exposes the REST endpoints

service – Contains business logic and in-memory storage

repository – (To be added later) For database operations using JPA

API Endpoints
GET /employeepayrollservice/ – Retrieve all employees

GET /employeepayrollservice/get/{id} – Retrieve employee by ID

POST /employeepayrollservice/create – Add a new employee

PUT /employeepayrollservice/update – Update an existing employee

DELETE /employeepayrollservice/delete/{id} – Delete an employee by ID
