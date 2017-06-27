package com.dag.webservice.dao;

import com.dag.webservice.model.Product;
import com.dag.webservice.repository.WebServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsDaoImpl implements ProductsDao {

    @Autowired
    private WebServiceRepository repository;

    @Override
    public List<Product> getProducts() {

        return repository.findAll();
    }

    @Override
    public void populateProducts() {
        repository.save(new Product("Duct Tape", "Fixes things when a hammer can't", 5f));
        repository.save(new Product("Hammer", "Fixes things when duct tape can't", 20f));
        repository.save(new Product("Ball Jar", "Perfect jar for pickling", 4f));
    }

    @Override
    public void addProduct(Product product) {
        repository.save(product);
    }

}
