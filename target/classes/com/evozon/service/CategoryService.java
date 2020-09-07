package evozon.service;

import java.util.List;

import evozon.exceptionHandler.DAOExceptionHandler;
import evozon.model.Category;

public interface CategoryService {

	/*
	 * Retrieves all the products from the DB
	 */
	List<Category> getCategories() throws DAOExceptionHandler;
}
