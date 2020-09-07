package evozon.controller;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.ModelAndView;

import evozon.model.Product;
import evozon.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
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

	@GetMapping("/getProduct/{id}")
	public String showProduct(@PathVariable("id") int theId, Model theModel) throws ResourceAccessException {
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
