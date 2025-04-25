# Data Storage Plan

## 1. Storage Format
- Uses **SQLite** to persist data in a `.db` file.
- Database file name: `bookwarehouse.db`
- Stored in the application directory (e.g., `resources/db/`).
- Ensures on-disk persistence so data survives application restarts.

## 2. Tables and Stored Entities

| Table Name        | Description                                                                 |
|-------------------|-----------------------------------------------------------------------------|
| `Users`           | Stores user account info including username, email, password, admin status |
| `ShoppingCarts`   | Tracks each user's cart status, creation time, and checkout status          |
| `CartItems`       | Links individual books to specific carts and stores quantity selected       |
| `Inventory`       | Stores book data: ID, title, author, stock status, year, and quantity       |
| `Orders`          | Records completed purchases, total cost, order date, and shipping method    |
| `Shipping`        | Lists available shipping methods and associated prices                      |

## 3. JDBC Access and Connection
- Uses a **JDBC driver** (`sqlite-jdbc`) to connect to the SQLite database.
- DAO (Data Access Object) pattern separates database logic from the business logic.
- SQL statements are executed using `PreparedStatement` to prevent SQL injection and improve performance.
- All entities (Users, Inventory, etc.) have corresponding DAO classes for CRUD operations.

## 4. Why SQLite?
- Lightweight and serverless — no separate database server required.
- Portable and embeddable within a Java Spring Boot application.
- Minimal configuration required for local development and testing.
- Data is persisted to disk and available between application restarts.

## 5. Seeding and Initialization
- On application startup:
  - Checks if `bookwarehouse.db` already exists.
    - If it **does not exist**:
      - Creates all required tables based on the schema.
      - Inserts initial **seed data**:
        - One admin user
        - Several inventory items (books)
        - Common shipping methods (e.g., Standard, Express)
    - If it **does exist**:
      - Connects to the existing database and loads data into memory as needed.
- Ensures realistic behavior similar to production systems (no data resets on each run).
