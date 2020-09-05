package evozon.dao.impl;

import org.hibernate.cfg.NotYetImplementedException;

import evozon.dao.ProductDAO;
import evozon.model.Product;

import java.util.List;

public class DefaultProductDAO implements ProductDAO {

    //The methods must be implemented

    @Override
    public Product getById(int id) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<Product> getAll() {
        throw new NotYetImplementedException();
    }

    @Override
    public Product addProduct(Product product) {
        throw new NotYetImplementedException();
    }
}
