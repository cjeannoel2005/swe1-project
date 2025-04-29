import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class orderClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;  // Kept as int per request

    private int cartId;
    private int userId;
    private String shippingType;

    @Column(name = "shipping_address")
    private String shippingAddress;  // Fixed to camelCase

    private int serialNumber;
    private double tax;
    private double subTotal;
    private double grandTotal;

    // No-arg constructor (required by JPA)
    public orderClass() {
    }

    // All-args constructor (without orderId since it's auto-generated)
    public orderClass(int cartId, int userId, String shippingType,
                      String shippingAddress, int serialNumber,
                      double tax, double subTotal, double grandTotal) {
        this.cartId = cartId;
        this.userId = userId;
        this.shippingType = shippingType;
        this.shippingAddress = shippingAddress;
        this.serialNumber = serialNumber;
        this.tax = tax;
        this.subTotal = subTotal;
        this.grandTotal = grandTotal;
    }

    // Getters
    public int getOrderId() { return orderId; }
    public int getCartId() { return cartId; }
    public int getUserId() { return userId; }
    public String getShippingType() { return shippingType; }
    public String getShippingAddress() { return shippingAddress; }
    public int getSerialNumber() { return serialNumber; }
    public double getTax() { return tax; }
    public double getSubTotal() { return subTotal; }
    public double getGrandTotal() { return grandTotal; }

    // Setters
    public void setCartId(int cartId) { this.cartId = cartId; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setShippingType(String shippingType) { this.shippingType = shippingType; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public void setSerialNumber(int serialNumber) { this.serialNumber = serialNumber; }
    public void setTax(double tax) { this.tax = tax; }
    public void setSubTotal(double subTotal) { this.subTotal = subTotal; }
    public void setGrandTotal(double grandTotal) { this.grandTotal = grandTotal; }

    // Optional: Add this if you need to set orderId manually
    //public void setOrderId(int orderId) { this.orderId = orderId; }
}