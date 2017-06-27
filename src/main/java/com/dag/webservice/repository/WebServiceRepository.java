package com.dag.webservice.repository;

import com.dag.webservice.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebServiceRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
}
