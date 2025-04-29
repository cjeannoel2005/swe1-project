import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class shoppingCart {  // Kept original camelCase naming

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    private int userId;
    private boolean isEmpty;

    // Proper no-arg constructor (fixed initialization issues)
    public shoppingCart() {
        // Default values will be set automatically (0 for int, false for boolean)
    }

    // Proper parameterized constructor
    public shoppingCart(int userId, boolean isEmpty) {
        this.userId = userId;
        this.isEmpty = isEmpty;
        // cartId is auto-generated
    }

    // Getters
    public int getCartId() { return cartId; }
    public int getUserId() { return userId; }
    public boolean getIsEmpty() { return isEmpty; }

    // Setters
    public void setCartId(int cartId) { this.cartId = cartId; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setIsEmpty(boolean isEmpty) { this.isEmpty = isEmpty; }
}
