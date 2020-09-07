package evozon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import evozon.dao.ProductDAO;
import evozon.exceptionHandler.DAOExceptionHandler;
import evozon.model.Product;
import evozon.service.ProductService;

@Service
public class DefaultProductService implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	@Transactional
	public Product getById(int id) throws DAOExceptionHandler {
		if (id != 0) {
			return productDAO.getById(id);
		} else {
			throw new DAOExceptionHandler("The id is 0");
		}
	}

	@Override
	@Transactional
	public List<Product> getProducts() throws DAOExceptionHandler {

		if (productDAO.getProducts().isEmpty()) {
			throw new DAOExceptionHandler("The list is empty");
		} else {
			return productDAO.getProducts();
		}
	}

	@Override
	@Transactional
	public Product addProduct(Product product) throws DAOExceptionHandler{
		if(product!=null) {
			return productDAO.addProduct(product);
		}else {
			throw new DAOExceptionHandler("The product is null");
		}
		
	}
}
