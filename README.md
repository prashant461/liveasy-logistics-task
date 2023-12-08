# Liveasy Logistics Task

## Overview

This project is a logistics management system that allows users to manage and track loads. It provides a set of RESTful API endpoints for performing CRUD operations on loads.

### Prerequisites

- Java 8 or higher
- Maven
- Your preferred IDE (e.g., IntelliJ, Eclipse)
- MySQL or another relational database

### Installation

1. Clone the repository to your local machine:

2. Open the project in your IDE.

3. Configure the database connection in the application.properties file.

4. Build and run the application.

### Usage
#### API Endpoints
  The API provides the following endpoints for managing loads:

Get All Loads
  ```
  GET localhost:8080/load
  ```
Get Load by ID
  ```
  GET localhost:8080/load/{id}
  ```

Add New Load
  ```
  POST localhost:8080/load
  ```
  ```
  Request Headers:
  
  Content-Type: application/json
  Request Body:
    
    json
    {
        "loadingPoint": "delhi",
        "unloadingPoint": "jaipur",
        "productType": "chemicals",
        "truckType": "canter",
        "noOfTrucks": 1,
        "weight": 1000,
        "comment": "This is important...",
    }
  ```
    
Update Load
  ```
  PUT localhost:8080/load/{id}
  ```
    
    ```
    Request Headers:
    
    Content-Type: application/json
    Request Body:
    
    json
    {
        "loadingPoint": "Pune",
        "unloadingPoint": "jaipur",
        "productType": "chemicals",
        "truckType": "canter",
        "noOfTrucks": 1,
        "weight": 1000,
        "comment": "This is important...",
        "date": "01-11-2020"
    }
    ```
    
Delete Load
  ```
  DELETE localhost:8080/load/{id}
  ```
