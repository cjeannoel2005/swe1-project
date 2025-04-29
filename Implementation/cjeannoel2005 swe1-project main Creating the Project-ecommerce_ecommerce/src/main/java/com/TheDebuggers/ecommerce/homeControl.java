package com.TheDebuggers.ecommerce;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homeControl {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/checkout")
    public String checkoutPage() {
        return "checkout";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/shoppingCart")
    public String shoppingCartPage() {
        return "ShoppingCart";
    }

    @GetMapping("/adminPage")  // ← NEW MAPPING
    public String adminPage() {
        return "adminPage";    // Must match filename exactly
    }

    @GetMapping("/bookTemplate")
    public String bookTemplatePage() {
        return "Book_Template";
    }
}