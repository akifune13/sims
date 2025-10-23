# Simple Inventory Management System

A basic **Enterprise Web Application** built using **Spring Boot**, **Freemarker**, and **MySQL**, implementing full **CRUD functionality** through RESTful APIs.
This project serves as a simple inventory system that allows users to manage products — including viewing, adding, editing, and deleting inventory records.

---

## Technologies Used

* **Backend:** Spring Boot (Java)
* **Frontend:** Freemarker Templates
* **Database:** MySQL
* **ORM:** Spring Data JPA / Hibernate
* **Build Tool:** Maven
* **REST API:** Spring Web

---

## Features

* Add new products to inventory
* View list of all products
* Edit and delete products
* REST API endpoints for all CRUD operations
* Data persistence with MySQL
* User-friendly interface using Freemarker templates

---

## Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/demo/
 │   │   ├── controller/
 │   │   │   ├── ProductController.java
 │   │   │   └── ProductRestController.java
 │   │   ├── model/
 │   │   │   └── Product.java
 │   │   ├── repository/
 │   │   │   └── ProductRepository.java
 │   │   ├── service/
 │   │   │   ├── IProductService.java
 │   │   │   └── ProductService.java
 │   │   └── DemoApplication.java
 │   └── resources/
 │       ├── templates/
 │       │   ├── index.html
 │       │   ├── addProduct.ftlh
 │       │   └── showProducts.ftlh
 │       ├── application.properties
 │       └── static/
 └── test/
```

---

## Setup and Installation

### 1. Prerequisites

Make sure you have installed:

* Java 17 or higher
* MySQL Server
* Maven
* Any IDE (IntelliJ IDEA, Eclipse, VS Code with Java)

---

### 2. Database Configuration

1. Create a new MySQL database:

   ```sql
   CREATE DATABASE inventorydb;
   ```
2. Update your `application.properties` file:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/inventorydb?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=yourpassword

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   server.port=18080
   ```

---

### 3. Run the Application

In your terminal or IDE:

```bash
mvn spring-boot:run
```

Then open your browser and go to:
[http://localhost:18080](http://localhost:18080)

---

## REST API Endpoints

| Method     | Endpoint             | Description                |
| ---------- | -------------------- | -------------------------- |
| **GET**    | `/api/products`      | Get all products           |
| **POST**   | `/api/products`      | Add a new product          |
| **PUT**    | `/api/products/{id}` | Update an existing product |
| **DELETE** | `/api/products/{id}` | Delete a product           |

---

## Freemarker Pages

| Page                | URL Path       | Description                        |
| ------------------- | -------------- | ---------------------------------- |
| `index.html`        | `/`            | Home page with navigation          |
| `addProduct.ftlh`   | `/add-product` | Form to add a new product          |
| `showProducts.ftlh` | `/products`    | Displays all products in inventory |

---

## Future Improvements

* Add user authentication (Admin login)
* Add supplier and category modules
* Include stock alerts for low quantity
* Add export feature (CSV or PDF)
