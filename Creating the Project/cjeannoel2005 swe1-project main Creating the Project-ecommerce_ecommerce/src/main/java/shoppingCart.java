import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class shoppingCart {
@Id
    public int cartId;
    public int userId;
    public boolean isEmpty;

    public shoppingCart() {
        this.cartId = cartId;
        this.userId = userId;
        this.isEmpty = getIsEmpty();
    }
    // put the getters
    public int getCartId(){return cartId;}
    public int getUserId(){return userId;}
    public boolean getIsEmpty(){return isEmpty;}

    // the setters
    public void setCartId(int cartId){this.cartId = cartId;}
    public void setUserId(int userId){this.userId = userId;}
    public void setIsEmpty(boolean isEmpty){this.isEmpty = isEmpty;}


}
