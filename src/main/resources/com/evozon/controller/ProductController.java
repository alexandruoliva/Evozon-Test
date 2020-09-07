package evozon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.ResourceAccessException;

import evozon.model.Product;
import evozon.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/list")
	public String listProducts(Model theModel) {
		List<Product> theProducts = productService.getProducts();
		theModel.addAttribute("products", theProducts);
		return "products";
	}

	@GetMapping("/addProduct")
	public String addProduct(Model theModel) {
		Product theProduct = new Product();
		theModel.addAttribute("product", theProduct);
		return "addProduct";
	}

	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product theProduct) {
		productService.addProduct(theProduct);
		return "redirect:/product/list";
	}

	@GetMapping("/getProduct")
	public String showProduct(@RequestParam("id") int theId, Model theModel) throws ResourceAccessException {
		Product theProduct = productService.getById(theId);
		theModel.addAttribute("product", theProduct);
		return "product";
	}

	@GetMapping("/findProduct")
	public String findProduct(Model theModel) {
		Product theProduct = new Product();
		theModel.addAttribute("findProduct", theProduct);
		return "findProduct";
	}

}
