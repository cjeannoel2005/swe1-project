# Example Data

## Users Table

| customerId | username     | email                  | password    | isAdmin |
|------------|--------------|------------------------|-------------|---------|
| 2          | john_doe      | john.doe@example.com    | password123 | FALSE   |
| 3          | jane_smith    | jane.smith@example.com  | mypassword  | FALSE   |

- Regular users (`john_doe`, `jane_smith`) are also seeded for use in the system.

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

| cartItemId | cartId | ISBN | quantity |
|------------|--------|--------|----------|
| 1          | 3      | B001   | 2        |
| 2          | 3      | B002   | 1        |

- Items in `jane_smith`'s cart are seeded with 2 copies of 'The Great Gatsby' and 1 copy of '1984'.

---

## Order Table

| orderId | cartId | userId | shippingType | shippingAddress                       | serialNumber | tax   | subTotal | grandTotal |
|---------|--------|--------|--------------|---------------------------------------|--------------|-------|----------|------------|
| 1       | 3      | 3      | Ground        | 1234 Elm Street, Springfield, IL      | 0383         | 2.50  | 30.97    | 33.47      |

- The order for `jane_smith` includes the items from her shopping cart.
- The order uses the 'Ground' shipping type and is delivered to the provided shipping address.
- The order contains calculated tax, subtotal, and grand total amounts.

