package evozon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import evozon.exceptionHandler.DAOExceptionHandler;
import evozon.model.Category;
import evozon.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/list")
	public String listProducts(Model theModel) {
		List<Category> theCategories = null;
		try {
			theCategories = categoryService.getCategories();
		} catch (DAOExceptionHandler e) {
			e.printStackTrace();
		}
		theModel.addAttribute("categories", theCategories);
		return "categories";
	}

}
