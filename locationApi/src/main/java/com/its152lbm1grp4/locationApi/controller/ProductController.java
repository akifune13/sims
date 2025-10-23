package com.its152lbm1grp4.locationApi.controller;

import com.its152lbm1grp4.locationApi.model.Product;
import com.its152lbm1grp4.locationApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    // 🏠 Default landing page (redirects to static index.html)
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

    // 📦 Show all products
    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "showProducts";
    }

    // ➕ Add Product Page
    @GetMapping("/add-product")
    public String showAddForm() {
        return "addProduct";
    }

    // 📝 Save New Product
    @PostMapping("/add-product")
    public String addProduct(@RequestParam String name,
                             @RequestParam String brand,
                             @RequestParam double price,
                             @RequestParam int quantity,
                             Model model) {
        Product product = new Product();
        product.setName(name);
        product.setBrand(brand);
        product.setPrice(price);
        product.setQuantity(quantity);

        productService.saveProduct(product);

        model.addAttribute("products", productService.findAll());
        return "showProducts";
    }

    // ✏️ Edit Product Page
    @GetMapping("/edit-product")
    public String showEditForm(Model model) {
        model.addAttribute("products", productService.findAll());
        return "editProduct";
    }

    // 🔁 Update Product
    @PostMapping("/update-product")
    public String updateProduct(@RequestParam Long id,
                                @RequestParam String name,
                                @RequestParam String brand,
                                @RequestParam double price,
                                @RequestParam int quantity,
                                Model model) {
        Product product = productService.findById(id);
        if (product != null) {
            product.setName(name);
            product.setBrand(brand);
            product.setPrice(price);
            product.setQuantity(quantity);
            productService.updateProduct(product);
        }

        model.addAttribute("products", productService.findAll());
        return "showProducts";
    }

    // ❌ Delete Product Page
    @GetMapping("/delete-product")
    public String showDeleteForm(Model model) {
        model.addAttribute("products", productService.findAll());
        return "deleteProduct";
    }

    // 🗑️ Handle Product Deletion
    @PostMapping("/delete-product")
    public String deleteProduct(@RequestParam Long id, Model model) {
        productService.deleteProduct(id);
        model.addAttribute("products", productService.findAll());
        return "showProducts";
    }
}
