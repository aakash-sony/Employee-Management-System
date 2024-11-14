![updateEmp](https://github.com/user-attachments/assets/5052b41e-c72f-40c8-855e-d5fcd015403f)
![empHome](https://github.com/user-attachments/assets/5dcac293-1feb-4181-a01e-62ef20041ebc)
![createEmp](https://github.com/user-attachments/assets/10dd2c8c-2cd8-4ac9-b8a0-28e7bf093eef)
# Employee Management System

This project is a simple **Employee Management System** built using **Spring Boot** and **Thymeleaf** for front-end rendering. The application implements basic **CRUD (Create, Read, Update, Delete)** operations to manage employee data, along with **input validation** to ensure proper and secure data entry.

The project demonstrates how to integrate **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, **PostgreSQL**, and **Java Bean Validation** (JSR 303/380) for input validation.

---

## Features

- **Add new employees**: Add employee details such as name, email, and department, with proper validation for each field.
- **View employee list**: Display all employees in a table with pagination support.
- **Edit employee details**: Update employee information with validation checks.
- **Delete employees**: Remove employees from the system.
- **Responsive UI**: Built using **Thymeleaf** templates to provide a user-friendly interface.
- **Input Validation**: Ensures that only valid employee data is entered, including checks for required fields, correct email format, and maximum length constraints.

---

## Technologies Used

- **Spring Boot**: A Java-based framework for building production-grade web applications.
- **Spring Data JPA**: Simplifies database operations by providing built-in CRUD functionality.
- **Thymeleaf**: A modern server-side Java template engine for web and standalone environments.
- **PostgreSql Database**: A database used for storing the record of employee.
- **Spring MVC**: A framework for building web applications based on the Model-View-Controller design pattern.
- **Bootstrap**: Front-end framework used for building responsive and mobile-first websites.
- **Java Bean Validation**: Used to validate user input in forms.

---

## Input Validation

Input validation is an essential part of ensuring that user data is consistent and secure. This application uses **Java Bean Validation** annotations to enforce validation rules on the employee form fields. The key validations applied are:

- **Not Empty**: Ensures that fields such as `name`, `email`, and `mobileNumber` are not left blank and should be proper format.
- **Email Format**: Validates the format of the email address entered by the user.
- **Length Constraints**: Ensures that fields like `name` do not exceed a certain length.

## Prerequisites
Before running the project, ensure that you have the following installed on your system:

- **Java** (JDK 11 or higher)
- **Maven** (for building the project)
- **IDE** (IntelliJ IDEA, Eclipse, etc.)
- **Git** (for cloning the repository)

## Acknowledgments
- Thanks to the Spring Boot community for building such an amazing framework.
- Special thanks to Thymeleaf for making dynamic web pages easy to implement.
- Thanks to the Java Bean Validation API for helping us ensure proper data validation.
