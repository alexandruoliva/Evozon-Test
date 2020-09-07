package evozon.dao;

import java.util.List;

import evozon.model.Category;

public interface CategoryDAO {
	
	/*
     * Retrieves all the products from the DB
     */
    List<Category> getCategories();

}
