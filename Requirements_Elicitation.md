##### Table Legend
> Effort - measured in days\
> MH - Must Have | NH - Needs to Have | WH - Wants to Have\
> F/NF - Functional / Non-Functional



## **Version 1**
####

### Epic T2E-1: User Authentication

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-1 | Users can self-register with unique username and 6+ character password (Admins cannot self-register) | MH | 1 | F |
| T2S-2 | Users can log in with credentials | MH | 0.5 | F |
| T2S-3 | Admins can promote users to admin status (Via UI preferred) | MH | 1 | F |

### Epic T2E-2: Inventory Display & Search

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-4 | Display inventory sorted high-to-low price with name, price, image, description | MH | 2 | F |
| T2S-5 | Search inventory by using name/description keywords | MH | 1 | F |

### Epic T2E-3: Shopping Cart & Checkout

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-6 | Add/remove items from cart | MH | 1.5 | F |
| T2S-7 | Disable checkout option if cart is empty | MH | 0.25 | F |
| T2S-8 | Checkout shows USD subtotal (formatted $X,XXX.XX) | MH | 0.5 | F |
| T2S-9 | Collect shipping, payment, and contact info | MH | 2 | F |
| T2S-10 | Confirm Order shows items, tax (6%), shipping, total | MH | 1 | F |
| T2S-11 | Complete Order shows receipt and removes inventory | MH | 1.5 | F |
| T2S-12 | Email reciept displaying order in browser | MH | 0.5 | F |

### Epic T2E-4: Admin Features

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-13 | View sales reports with buyer info | MH | 2 | F |
| T2S-14 | Add inventory manually via database (Via UI preferred) | MH | 1 | F |

### Epic T2E-5: Mockups

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-15 | Deliver high-fidelity mockups of all screens | MH | 3 | NF |

### Extra Requirements
- Pricing format stored as decimal/currency in base-10 (No Floating Point!)


<br />

## **Version 2** 
####

### Epic T2E-1: Enhanced Admin UI

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-1 | Admin UI for user promotion | NH | 1.5 | F |
| T2S-2 | Admin UI for inventory + images | WH | 2 | F |
| T2S-3 | Clickable sales report items | WH | 1 | F |

### Epic T2E-2: User Experience

| Story ID | Description | Priority | Effort | F/NF |
|----------|-------------|----------|--------|------|
| T2S-4 | Multiple images per item | WH | 2 | F |
| T2S-5 | Email receipts (SendGrid) | NH | 3 | F |


