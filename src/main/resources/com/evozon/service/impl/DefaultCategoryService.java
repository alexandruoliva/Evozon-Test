package evozon.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evozon.dao.CategoryDAO;
import evozon.model.Category;
import evozon.service.CategoryService;

@Service
public class DefaultCategoryService  implements CategoryService{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Override
	@Transactional
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}

}
