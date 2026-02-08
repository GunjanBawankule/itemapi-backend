Item Management REST API
This project is a simple Spring Boot–based RESTful API developed to manage a collection of items, similar to basic functionality found in ecommerce or movie management platforms. The application allows users to create, retrieve, and view items using HTTP endpoints. It is designed as a beginner-friendly backend project to demonstrate REST API development using Java and Spring Boot.

The application uses in-memory storage to manage data, meaning no external database is required. All data is stored temporarily using an ArrayList and will be reset when the application restarts.

Tech Stack
Java 17+
Spring Boot
Maven
Spring Web
Jakarta Validation
Embedded Tomcat Server
In-memory data storage (ArrayList)

Project Features
RESTful API design
CRUD-style operations (Create and Read)
Input validation using @Valid
Clean controller–service structure
No database dependency
Easy to run and deploy

How to Run the Project

Clone or download the repository
Open the project in IntelliJ IDEA
Make sure Java 17 or above is installed
Let Maven download all dependencies
Run ItemapiApplication.java
The application will start on
http://localhost:8080

API Endpoints
Get All Items

GET /items
Returns a list of all available items.

Add a New Item

POST /items
Content-Type: application/json

Request Body Example:

{
"name": "Laptop",
"description": "Gaming Laptop",
"price": 70000
}

Get Item by ID

GET /items/{id}

Example:
GET /items/1
Test Endpoint
GET /items/index
Returns a simple welcome message to verify the API is working.

Validation
Request body validation is implemented using Jakarta Validation
Invalid inputs will result in appropriate error responses

Notes: 
This project does not use any database
Data is stored in memory and resets on application restart
Designed for learning, assignments, and backend practice

