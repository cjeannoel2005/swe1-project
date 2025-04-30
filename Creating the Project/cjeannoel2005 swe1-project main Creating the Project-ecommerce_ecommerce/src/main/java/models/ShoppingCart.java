import jakarta.persistence.*;

@Entity
public class ShoppingCartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private ShoppingCart cart;

    private String bookId;
    private String bookTitle;
    private double price;
    private int quantity;

    // Constructors
    public ShoppingCartItem() {}

    public ShoppingCartItem(ShoppingCart cart, String bookId, String bookTitle, double price, int quantity) {
        this.cart = cart;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
