package com.its152lbm1grp4.locationApi.controller;

import com.its152lbm1grp4.locationApi.model.Product;
import com.its152lbm1grp4.locationApi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
}
