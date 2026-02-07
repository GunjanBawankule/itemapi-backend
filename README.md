# Item Management REST API

This is a simple Spring Boot REST API for managing items (similar to ecommerce or movie platforms).

## Tech Stack
- Java 17
- Spring Boot
- Maven
- In-memory storage (ArrayList)

## How to Run
1. Open project in IntelliJ
2. Run ItemapiApplication.java
3. Server runs on http://localhost:8080

## API Endpoints

### Add Item
POST /items

Request Body:
{
"name": "Laptop",
"description": "Gaming Laptop",
"price": 70000
}

### Get Item by ID
GET /items/{id}

Example:
GET /items/1

## Notes
- No database is used
- Data is stored in memory
- Input validation is implemented
