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
    public String loginPage(){
        return "login";
    }

    @GetMapping("/checkout")
        public String checkoutPage(){
        return "checkout";
        }

        @GetMapping("/register")
        public String registerPage(){
        return "register";
        }
        @GetMapping("/ShoppingCart")
        public String ShoppingCartPage(){
            return "ShoppingCart";
            }
        @GetMapping("/adminPage")
    public String AdminPage(){
        return "AdminPage";
        }
}
