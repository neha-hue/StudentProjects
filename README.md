# StudentProjects
<h3>This repository provides a simple CRUD (Create, Read, Update, Delete) application for managing student records using Spring Boot. </h3>
<h3>The application allows users to perform basic operations on student data, such as adding new students, retrieving student details, updating existing student records, and deleting student information.</h3>
<h2>Used Tech stacks and Tools</h2><br/>

<h2>Java</h2>
<h2>MySQL</h2>
<h2>Spring Boot</h2>
<h2>Maven</h2>

<h1>Prerequisites</h1>
Before running this application, ensure that you have the following:<br/>

Java Development Kit (JDK) installed on your machine (version 8 or higher).<br/>
Maven build tool installed.<br/>
A database management system (such as MySQL, PostgreSQL, or H2) installed and configured.<br/>

<h1>Setup</h1><br/>
1.Clone the repository to your local machine:<br/>
git clone https://github.com/your-username/student-crud-spring-boot.git<br/>
2.Open the project in your preferred IDE.<br/>

3.Configure the database connection in the application.properties file, located in the src/main/resources directory. Modify the following properties according to your database setup:<br/>
spring.datasource.url=jdbc:mysql://localhost:3306/student_db<br/>
spring.datasource.username=your-username<br/>
spring.datasource.password=your-password<br/>

<h1>Usage</h1><br/>
The application provides the following endpoints for CRUD operations on student records:<br/>

GET /students: Retrieves a list of all students.<br/>
GET /students/{id}: Retrieves a specific student by their ID.<br/>
POST /students: Creates a new student.<br/>
PUT /students/{id}: Updates an existing student by their ID.<br/>
DELETE /students/{id}: Deletes a student by their ID.<br/>
Make HTTP requests to the appropriate endpoints using tools like cURL, Postman, or your preferred REST client.<br/>
