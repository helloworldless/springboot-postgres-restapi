package com.dag.webservice.rest;

import com.dag.webservice.dao.ProductsDao;
import com.dag.webservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/products")
public class Resource {

    @Autowired
    private ProductsDao productsDao;

    @Path("/")
    @GET
    @Produces("application/json")
    public List<Product> getProducts() {
        return productsDao.getProducts();
    }
}
