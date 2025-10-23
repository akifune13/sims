package com.its152lbm1grp4.locationApi.service;

import com.its152lbm1grp4.locationApi.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product addProduct(Product product);
}