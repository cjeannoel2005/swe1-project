@Controller
@RequestMapping("/cart")
public class ShoppingCartController {
    
    @Autowired
    private ShoppingCartRepository cartRepository;
    
    @Autowired
    private ShoppingCartItemRepository cartItemRepository;
    
    // Get or create cart for user
    private ShoppingCart getOrCreateCart(int userId) {
        ShoppingCart cart = cartRepository.findByUserId(userId);
        if (cart == null) {
            cart = new ShoppingCart(userId, true);
            cartRepository.save(cart);
        }
        return cart;
    }
    
    // Display shopping cart page
    @GetMapping
    public String showCart(Model model, HttpSession session) {
        // In a real app, get userId from authentication
        int userId = 1; // Temporary - replace with actual user ID
        
        ShoppingCart cart = getOrCreateCart(userId);
        List<ShoppingCartItem> cartItems = cartItemRepository.findByCart_CartId(cart.getCartId());
        
        double total = cartItems.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        
        cart.setIsEmpty(cartItems.isEmpty());
        cartRepository.save(cart);
        
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("total", total);
        model.addAttribute("itemCount", cartItems.size());
        
        return "shopping-cart";
    }
    
    // Add item to cart
    @PostMapping("/add")
    public String addToCart(
            @RequestParam String bookId,
            @RequestParam String bookTitle,
            @RequestParam double price,
            HttpSession session) {
        
        int userId = 1; // Replace with actual user ID
        ShoppingCart cart = getOrCreateCart(userId);
        
        // Check if item already exists in cart
        ShoppingCartItem existingItem = cartItemRepository.findByCart_CartIdAndBookId(cart.getCartId(), bookId)
                .orElse(null);
        
        if (existingItem != null) {
            existingItem.setQuantity(existingItem.getQuantity() + 1);
            cartItemRepository.save(existingItem);
        } else {
            ShoppingCartItem newItem = new ShoppingCartItem(cart, bookId, bookTitle, price, 1);
            cartItemRepository.save(newItem);
        }
        
        return "redirect:/cart";
    }
    
    // Remove item from cart
    @PostMapping("/remove/{itemId}")
    public String removeFromCart(@PathVariable int itemId) {
        cartItemRepository.deleteById(itemId);
        return "redirect:/cart";
    }
    
    // Checkout
    @PostMapping("/checkout")
    public String checkout(HttpSession session) {
        int userId = 1; // Replace with actual user ID
        ShoppingCart cart = cartRepository.findByUserId(userId);
        
        if (cart != null) {
            cartItemRepository.deleteByCart_CartId(cart.getCartId());
            cart.setIsEmpty(true);
            cartRepository.save(cart);
        }
        
        return "redirect:/cart?checkoutSuccess";
    }
}
