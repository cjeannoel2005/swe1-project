public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
    ShoppingCart findByUserId(int userId);
}

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Integer> {
    List<ShoppingCartItem> findByCart_CartId(int cartId);
    void deleteByCart_CartId(int cartId);
}
