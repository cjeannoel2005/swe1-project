import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class shoppingCartItem {  // Kept original camelCase naming

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemId;

    private int cartId;
    private String bookId;
    private int quantity;

    // No-arg constructor (required by JPA)
    public shoppingCartItem() {
    }

    // All-args constructor
    public shoppingCartItem(int cartItemId, int cartId, String bookId, int quantity) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    // Fixed getters (removed parameters)
    public int getCartItemId() { return cartItemId; }
    public int getCartId() { return cartId; }
    public String getBookId() { return bookId; }
    public int getQuantity() { return quantity; }

    // Fixed setters (corrected spelling and parameters)
    public void setCartItemId(int cartItemId) { this.cartItemId = cartItemId; }
    public void setCartId(int cartId) { this.cartId = cartId; }
    public void setBookId(String bookId) { this.bookId = bookId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}