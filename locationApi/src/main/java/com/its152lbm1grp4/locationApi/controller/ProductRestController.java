package com.its152lbm1grp4.locationApi.controller;

import com.its152lbm1grp4.locationApi.model.Product;
import com.its152lbm1grp4.locationApi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/api/products")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }
}
