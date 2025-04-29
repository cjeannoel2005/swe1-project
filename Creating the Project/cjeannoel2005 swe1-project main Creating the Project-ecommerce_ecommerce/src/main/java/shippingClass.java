import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class shippingClass {  // Class name follows Java conventions (uppercase)

    @Id  // shippingType is the primary key (must be unique & immutable)
    private String shippingType;

    private double price;

    // Required no-arg constructor (protected or public)
    public shippingClass() {
    }

    // Constructor with fields
    public shippingClass(String shippingType, double price) {
        this.shippingType = shippingType;
        this.price = price;
    }

    // Getters and setters
    public String getShippingType() {
        return shippingType;
    }

    // WARNING: Changing a primary key after creation can cause issues!
    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}