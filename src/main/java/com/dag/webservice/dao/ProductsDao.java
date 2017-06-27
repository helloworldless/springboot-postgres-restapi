package com.dag.webservice.dao;

import com.dag.webservice.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductsDao {
    List<Product> getProducts();

    void populateProducts();

    void addProduct(Product product);
}
