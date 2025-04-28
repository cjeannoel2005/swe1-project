public class shoppingCart {

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
    public int setCartId(int cartId){this.cartId = cartId;}
    public int setUserId(int userId){this.userId = userId;}
    public int setIsEmpty(boolean isEmpty){this.isEmpty = isEmpty;}


}
