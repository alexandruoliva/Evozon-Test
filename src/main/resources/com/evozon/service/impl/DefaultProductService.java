package evozon.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import evozon.dao.ProductDAO;
import evozon.model.Product;
import evozon.service.ProductService;


@Service
public class DefaultProductService implements ProductService {

	@Autowired
    private ProductDAO productDAO;

    @Override
    @Transactional
    public Product getById(int id) {
        return productDAO.getById(id);
    }

    @Override
    @Transactional
    public List<Product> getProducts() {
        return productDAO.getProducts();
    }

    @Override
    @Transactional
    public Product addProduct(Product product) {
        return productDAO.addProduct(product);
    }
}
