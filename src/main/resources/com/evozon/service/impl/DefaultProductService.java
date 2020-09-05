package evozon.service.impl;


import java.util.List;

import evozon.dao.ProductDAO;
import evozon.model.Product;
import evozon.service.ProductService;


public class DefaultProductService implements ProductService {

    private ProductDAO productDAO;

    @Override
    public Product getById(int id) {
        return productDAO.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productDAO.addProduct(product);
    }
}
