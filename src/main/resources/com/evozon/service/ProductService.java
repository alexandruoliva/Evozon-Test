package evozon.service;


import java.util.List;

import evozon.model.Product;

public interface ProductService {

    /*
     * Retrieves a product from the DB based on the id
     */
    Product getById(int id);

    /*
     * Retrieves all the products from the DB
     */
    List<Product> getProducts();

    /*
     * Adds a new product to the DB
     */
    Product addProduct(Product product);
}
