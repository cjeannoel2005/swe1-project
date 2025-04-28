# Essential Seed Data

## Users Table

| customerId | username | email               | password       | isAdmin |
|------------|----------|---------------------|----------------|---------|
| 1          | admin    | admin@example.com    | adminpassword  | TRUE    |

- The `admin` account is created at system launch.

---

## Shipping Table

| shippingType | price |
|--------------|-------|
| Ground       | 0.00  |
| 3-Day        | 19.00 |
| Overnight    | 29.00 |

- These types are available for users to select during checkout.

---

## Inventory Table

| bookId | title                  | description                               | price | quantity | inStock | picture                   |
|--------|------------------------|-------------------------------------------|-------|----------|---------|----------------------------|
| B001   | The Great Gatsby        | A classic novel by F. Scott Fitzgerald.   | 10.99 | 50       | TRUE    | /images/gatsby.jpg         |
| B002   | 1984                    | A dystopian novel by George Orwell.       | 8.99  | 30       | TRUE    | /images/1984.jpg           |
| B003   | Moby Dick               | A novel by Herman Melville about a whale. | 12.99 | 20       | TRUE    | /images/moby_dick.jpg      |
| B004   | To Kill a Mockingbird   | A novel by Harper Lee about racial injustice. | 9.99 | 40 | TRUE | /images/mockingbird.jpg |

- Books are seeded with titles, descriptions, prices, and quantities.
- The `inStock` column indicates whether the book is available for purchase.
- Each book also has an associated picture path.
