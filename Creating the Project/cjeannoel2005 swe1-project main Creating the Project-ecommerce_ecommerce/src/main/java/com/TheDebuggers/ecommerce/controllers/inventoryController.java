package com.TheDebuggers.ecommerce.controller;

import com.TheDebuggers.ecommerce.model.inventoryTable;
import com.TheDebuggers.ecommerce.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/addBook")
    public String showAddBookPage() {
        return "addBook"; // Corresponding Thymeleaf template
    }

    @PostMapping("/addBook")
    public String addBook(
            @RequestParam("bookId") String bookId,
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("price") double price,
            @RequestParam("quantity") int quantity,
            @RequestParam(value = "image", required = false) MultipartFile image,
            Model model) {

        try {
            // Handle image upload
            String imageUrl = null;
            if (image != null && !image.isEmpty()) {
                String uploadDirPath = new File("src/main/resources/static/uploads/books").getAbsolutePath();
                File uploadDir = new File(uploadDirPath);

                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }

                String originalFilename = image.getOriginalFilename();
                String imageName = System.currentTimeMillis() + "_" + originalFilename;
                Path destinationPath = Paths.get(uploadDirPath, imageName);
                Files.copy(image.getInputStream(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
                imageUrl = "/uploads/books/" + imageName;
            }

            // Create and save book inventory
            inventoryTable book = new inventoryTable(
                    bookId,
                    title,
                    description,
                    price,
                    quantity,
                    quantity > 0  // Set inStock based on quantity
            );

            if (imageUrl != null) {
                book.setPicture(imageUrl);
            }

            inventoryRepository.save(book);
            model.addAttribute("successMessage", "✅ Book added successfully!");

        } catch (IOException e) {
            model.addAttribute("errorMessage", " Failed to upload image or save book: " + e.getMessage());
            e.printStackTrace();
        }

        return "addBook";
    }
}
