package com.dag.webservice.dao;

import com.dag.webservice.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsDaoImpl implements ProductsDao {

    @Override
    public List<Product> getProducts() {

        List<Product> products = new ArrayList<>();

        Product ductTape = new Product("Duct Tape", "Fixes things when a hammer can't", 5f);
        Product hammer = new Product("Hammer", "Fixes things when duct tape can't", 20f);
        Product jar = new Product("Ball Jar", "Perfect jar for pickling", 4f);

        products.add(ductTape);
        products.add(hammer);
        products.add(jar);

        return products;
    }

}
