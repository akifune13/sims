package com.its152lbm1grp4.locationApi.service;

import com.its152lbm1grp4.locationApi.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}
