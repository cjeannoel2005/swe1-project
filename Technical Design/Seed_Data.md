# Seed Data 

## User Entity

| userId | username      | password       | email                  | isAdmin |
|---------|---------------|----------------|-------------------------|----------|
| 1       | bookMaster25    | Books@2005      | admin@bookWarehouse.com     | TRUE     |

## Product Entity

| productId | name       | description     | price       | isSold |
|-----------|-----------|-----------------|-------------|--------|
| 001        | fiction book  | classic fiction novel with a twist  | 50.00  | FALSE 
| 002        | Fantasy       | draculla meets the walking dead love story           | 30.00      | FALSE   |
| 003        |romance for 44 | small time lawyer finds love and success after moving to a new city    | 150.00     | TRUE    |
| 004        |engineering book for begineers    | coursework book for first year students           | 10.00  |  FALSE   |

## shippingType Entity

| shippingTypeId | name       | cost  |
|------------------|------------|-------|
| 1                | Same day delivery  | 40.00 |
| 2                | 4/5-Day      | 15.00 |
| 3                | Ground     | 9.99  |

|   TaxTypeId      | name         |cost |
|------------------|--------------|-----|
|10                | local        | 5.00|
|20                | nation wide  | 9.99| 
|30                | international| 20.00| 
