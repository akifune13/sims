package com.its152lbm1grp4.locationApi.controller;

import com.its152lbm1grp4.locationApi.model.Product;
import com.its152lbm1grp4.locationApi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public String findProducts(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "showProducts";
    }

    @GetMapping("/add-product")
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("/add-product")
    public String addProductSubmit(@ModelAttribute Product product, Model model) {
        productService.addProduct(product);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "showProducts";
    }
}