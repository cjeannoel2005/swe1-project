# Data Storage Plan

## 1. Storage Format
- Uses **SQLite** to persist data in a `.db` file.
- Database file name: `bookwarehouse.db`
- Stored in the application directory (e.g., `resources/db/`).
- Ensures on-disk persistence so data survives application restarts.

## 2. Tables and Stored Entities

| Table Name      | Description                                           |
|-----------------|-------------------------------------------------------|
| `users`         | Stores user credentials, email, and admin status     |
| `products`      | Inventory data including names, prices, and status   |
| `shipping_types` | Available delivery methods with cost                 |
| `tax_types`      | Tax categories with corresponding rates              |

## 3. JDBC Access and Connection
- Uses a **JDBC driver** to access the database in **SQLite**.
- DAO (Data Access Object) pattern is used to separate SQL logic from the main application code.
- SQL statements are handled using `PreparedStatement` for security and performance.

## 4. Why SQLite?
- Lightweight and embedded – no external database server required.
- Easy to set up and integrates smoothly with Java through JDBC.
- Ideal for local development, prototypes, and small-scale applications.
- Data persists between application restarts (unlike in-memory storage).

## 5. Seeding and Initialization
- On startup, the application checks if `bookwarehouse.db` exists.
  - If it **does not exist**:
    - Creates all required tables.
    - Inserts essential **seed data**:
      - Admin account
      - Initial products
      - Shipping and tax types
  - If it **does exist**:
    - Connects and loads existing data.
- Ensures that the application behaves like a real-world system and does not reset data on every run.
