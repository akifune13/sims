package com.its152lbm1grp4.locationApi.service;

import com.its152lbm1grp4.locationApi.model.Product;
import com.its152lbm1grp4.locationApi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return repository.save(product);
    }
}
