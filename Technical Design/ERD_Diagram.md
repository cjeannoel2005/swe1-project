# Database ER Diagram

```mermaid
erDiagram
    USER {
        INTEGER customerId PK
        TEXT username
        TEXT email
        TEXT password
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
        TEXT shippingType PK
        NUMERIC price
    }
    INVENTORY {
        INTEGER ISBN PK
        TEXT title
        TEXT description
        NUMERIC price
        INTEGER quantity
        BOOLEAN inStock
        TEXT picture
    }
    ORDERS {
        INTEGER orderId PK
        INTEGER cartId FK
        INTEGER userId FK
        TEXT shippingType FK
        TEXT shippingAddress
        INTEGER serialNumber
        NUMERIC tax
        NUMERIC subTotal
        NUMERIC grandTotal
    }
    USER ||--o{ SHOPPINGCART: "has"
    SHOPPINGCART ||--o{ SHOPPINGCARTITEM: "contains"
    SHOPPINGCARTITEM }o--|{ INVENTORY: "refers to"
    SHOPPINGCART ||--o{ ORDER: "creates"
    ORDER }|--|| SHIPPING: "uses"
