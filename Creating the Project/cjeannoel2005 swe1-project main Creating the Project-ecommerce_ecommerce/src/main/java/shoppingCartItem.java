import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class shoppingCartItem {
@Id
    public int cartItemId;
    public int cartId;
    public String bookId;
    public int quantity ;

    public shoppingCartItem (int cartItemId, int cartId, String bookId , int quantity){
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    //the getters here
    public int getCartItemId (int cartItemId){return cartItemId;}
    public int getCartId(int cartId){return cartItemId;}
    public int getQuantity (int quantity){return quantity;}
    public void setQuantity (int quantity){this.quantity = quantity;}

    // the setters

    public void setCartId(int cartId) {this.cartId = cartId;}
    public void setCartItemId (int cartItemId){this.cartItemId = cartItemId;}
    public void setBookId (String bookId){this.bookId = bookId;}
    public void setQuanitity (int quanitity){this.quantity = quanitity;}
}
