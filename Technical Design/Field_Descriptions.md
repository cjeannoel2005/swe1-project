# Field Description Table

This table describes the fields for each entity in the database, including their data types, whether they are required or nullable, and their relationships (if applicable). This will help in understanding the structure and constraints of the database.

## Users Table

| Field      | Data Type           | Nullable | Relationship     | Notes                                                    |
|------------|---------------------|----------|------------------|----------------------------------------------------------|
| customerId | INTEGER             | NO       | Primary Key      | Unique identifier for each user. Auto-incremented.       |
| username   | VARCHAR(50)          | NO       |                  | Username for the user, must be unique.                   |
| email      | VARCHAR(100)         | NO       |                  | User's email address, must be unique.                    |
| password   | VARCHAR(255)         | NO       |                  | Hashed password for the user.                            |
| isAdmin    | BOOLEAN             | NO       |                  | Boolean value indicating if the user is an admin.        |

---

## Shipping Table

| Field        | Data Type           | Nullable | Relationship     | Notes                                                    |
|--------------|---------------------|----------|------------------|----------------------------------------------------------|
| shippingType | VARCHAR(50)          | NO       | Primary Key      | Unique shipping type identifier.|
| price        | DECIMAL(10, 2)       | NO       |                  | Price of the shipping option.                            |

---

## Inventory Table

| Field       | Data Type           | Nullable | Relationship     | Notes                                                    |
|-------------|---------------------|----------|------------------|----------------------------------------------------------|
| bookId      | VARCHAR(50)          | NO       | Primary Key      | Unique identifier for each book.                         |
| title       | VARCHAR(100)         | NO       |                  | Title of the book.                                       |
| description | TEXT                 | YES      |                  | Description of the book, can be null.                    |
| price       | DECIMAL(10, 2)       | NO       |                  | Price of the book.                                       |
| quantity    | INTEGER              | NO       |                  | Number of copies available.                              |
| inStock     | BOOLEAN             | NO       |                  | Indicates whether the book is in stock (TRUE or FALSE).  |
| picture     | VARCHAR(255)         | YES      |                  | Path to the image file for the book.          |

---

## ShoppingCart Table

| Field      | Data Type           | Nullable | Relationship     | Notes                                                    |
|------------|---------------------|----------|------------------|----------------------------------------------------------|
| cartId     | INTEGER             | NO       | Primary Key      | Unique identifier for each shopping cart. Auto-incremented.|
| userId     | INTEGER             | NO       | Foreign Key      | Foreign key referencing `Users.customerId`.              |
| isEmpty    | BOOLEAN             | NO       |                  | Indicates if the cart is empty (TRUE or FALSE).          |

---

## ShoppingCartItem Table

| Field        | Data Type           | Nullable | Relationship     | Notes                                                    |
|--------------|---------------------|----------|------------------|----------------------------------------------------------|
| cartItemId   | INTEGER             | NO       | Primary Key      | Unique identifier for each cart item. Auto-incremented.  |
| cartId       | INTEGER             | NO       | Foreign Key      | Foreign key referencing `ShoppingCart.cartId`.           |
| bookId       | VARCHAR(50)          | NO       | Foreign Key      | Foreign key referencing `Inventory.bookId`.              |
| quantity     | INTEGER             | NO       |                  | Number of books of the given `bookId` in the cart.       |

---

## Order Table

| Field          | Data Type           | Nullable | Relationship     | Notes                                                    |
|----------------|---------------------|----------|------------------|----------------------------------------------------------|
| orderId       | INTEGER             | NO       | Primary Key      | Unique identifier for each order. Auto-incremented.      |
| cartId        | INTEGER             | NO       | Foreign Key      | Foreign key referencing `ShoppingCart.cartId`.           |
| userId        | INTEGER             | NO       | Foreign Key      | Foreign key referencing `Users.customerId`.              |
| shippingType  | VARCHAR(50)          | NO       |                  | Shipping type for the order (e.g., Standard, Express).   |
| shippingAddress| VARCHAR(255)         | NO       |                  | Address where the order will be shipped.                 |
| serialNumber  | INTEGER             | NO       |                  | Unique serial number for the order.                      |
| tax           | DECIMAL(10, 2)       | NO       |                  | Tax applied to the order.                                |
| subTotal      | DECIMAL(10, 2)       | NO       |                  | Total amount before taxes for the order.                 |
| grandTotal    | DECIMAL(10, 2)       | NO       |                  | Total amount after taxes for the order.                  |

---
