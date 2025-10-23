package com.its152lbm1grp4.locationApi.repository;

import com.its152lbm1grp4.locationApi.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
