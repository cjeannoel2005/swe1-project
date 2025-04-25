# Seed Data

## Users Table

| customerId | username    | email                        | password    | isAdmin |
|------------|-------------|------------------------------|-------------|---------|
| 1          | admin       | admin@example.com            | adminpassword | TRUE    |
| 2          | john_doe    | john.doe@example.com         | password123 | FALSE   |
| 3          | jane_smith  | jane.smith@example.com       | mypassword  | FALSE   |

- The `admin` account is created at system launch.
- Regular users (`john_doe`, `jane_smith`) are also seeded for use in the system.

---

## Shipping Table

| shippingType | price |
|--------------|-------|
| Ground     | 0.00  |
| 3-Day      | 19.00 |
| Overnight    | 29.00 |

- These types are available for users to select during checkout.

---

## Inventory Table

| bookId | title                         | description                                      | price | quantity | inStock | picture                |
|--------|-------------------------------|--------------------------------------------------|-------|----------|---------|------------------------|
| B001   | The Great Gatsby              | A classic novel by F. Scott Fitzgerald.          | 10.99 | 50       | TRUE    | /images/gatsby.jpg      |
| B002   | 1984                          | A dystopian novel by George Orwell.              | 8.99  | 30       | TRUE    | /images/1984.jpg       |
| B003   | Moby Dick                     | A novel by Herman Melville about a whale.        | 12.99 | 20       | TRUE    | /images/moby_dick.jpg  |
| B004   | To Kill a Mockingbird         | A novel by Harper Lee about racial injustice.    | 9.99  | 40       | TRUE    | /images/mockingbird.jpg |

- Books are seeded with titles, descriptions, prices, and quantities.
- The `inStock` column indicates whether the book is available for purchase.
- Each book also has an associated picture path for the images stored in the repository.

---

## ShoppingCart Table

| cartId | userId | isEmpty |
|--------|--------|---------|
| 1      | 1      | TRUE    |
| 2      | 2      | TRUE    |
| 3      | 3      | FALSE   |

- Shopping carts are created for each user.
- The cart for `jane_smith` is not empty to emulate an active cart with items.

---

## ShoppingCartItem Table

| cartItemId | cartId | bookId | quantity |
|------------|--------|--------|----------|
| 1          | 3      | B001   | 2        |
| 2          | 3      | B002   | 1        |

- Items in `jane_smith`'s cart are seeded with 2 copies of 'The Great Gatsby' and 1 copy of '1984'.

---

## Order Table

| orderId | cartId | userId | shippingType | shippingAddress                       | serialNumber | tax   | subTotal | grandTotal |
|---------|--------|--------|--------------|---------------------------------------|--------------|-------|----------|------------|
| 1       | 3      | 3      | Ground     | 1234 Elm Street, Springfield, IL      | 0383    | 2.50  | 30.97    | 33.47      |

- The order for `jane_smith` includes the items from her shopping cart.
- The order uses the 'Standard' shipping type and is delivered to the provided shipping address.
- The order contains calculated tax, subtotal, and grand total amounts.

---
