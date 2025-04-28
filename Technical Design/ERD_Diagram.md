# Database ER Diagram

```mermaid
erDiagram
    USER {
        INTEGER customerId PK
        VARCHAR username
        VARCHAR email
        VARCHAR password
        BOOLEAN isAdmin
    }
    SHOPPINGCART {
        INTEGER cartId PK
        INTEGER userId FK
        BOOLEAN isEmpty
    }
    SHOPPINGCARTITEM {
        INTEGER cartItemId PK
        INTEGER cartId FK
        INTEGER ISBN FK
        INTEGER quantity
    }
    SHIPPING {
        VARCHAR shippingType PK
        Real price
    }
    INVENTORY {
        INTEGER ISBN PK
        VARCHAR title
        TEXT description
        Real price
        INTEGER quantity
        BOOLEAN inStock
        VARCHAR picture
    }
    ORDER {
        INTEGER orderId PK
        INTEGER cartId FK
        INTEGER userId FK
        VARCHAR shippingType FK
        VARCHAR shippingAddress
        INTEGER serialNumber
        Real tax
        Real subTotal
        Real grandTotal
    }
    USER ||--o{ SHOPPINGCART: "has"
    SHOPPINGCART ||--o{ SHOPPINGCARTITEM: "contains"
    SHOPPINGCARTITEM }o--|{ INVENTORY: "refers to"
    SHOPPINGCART ||--o{ ORDER: "creates"
    ORDER }|--|| SHIPPING: "uses"
