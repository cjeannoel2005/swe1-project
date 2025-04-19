# Requirements 

#### List of requirements 

### User Authentication
1. User Account Registration
   - Must allow self-registration
   - Unique username
   - Minimum 6-character password

2. User Login
   - Login via username and password

3. Admin User Creation
   - Existing admin can convert regular users to admin accounts
   - Cannot self-register as admin
   - Must get admin permission from existing admin

### Admin Features
1. Sales Reporting
   - Export sales report to CSV
   - Advanced reporting showing:
     - All purchased items
     - Purchaser information
     - Ability to view receipt for each sold item

2. Inventory Management
   - Manual inventory addition:
     - Add new items via admin interface (name, picture, price, description)
     - Alternative: Direct database entry if UI is too complex

3. Admin Interface
   - Simple UI for managing admin permissions
   - Track who has admin abilities

### Inventory Display
1. Main Product Screen
   - Show all available inventory
   - Sort from highest to lowest price
   - Hide sold items

2. Item Details
   - Name
   - At least one picture
   - Price in proper currency format ($10,000.00)
     - Stored in base-10 decimal/currency format (not floating point)
   - Description (e.g., "Super clean, low mileage liter bike...")

3. Search Functionality
   - Ability to search inventory

### Checkout Process
1. Shopping Cart
   - Add multiple items to cart
   - View cart contents with subtotal
   - Remove items or continue shopping
   - Empty cart returns to main screen automatically

2. Checkout
   - Disabled if cart is empty
   - Requires:
     - Shipping information
     - Credit card details (number, expiration, CVV)
   
3. Order Completion
   - Display receipt
   - Remove items from inventory
   - Generate email receipt

### Version 2 Enhancements
1. User Interface Improvements
   - Simplified admin management interface

2. Enhanced Checkout Experience
   - Automatic return to main screen when cart is emptied

