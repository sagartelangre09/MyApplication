package com.sagar.springmvcmaster.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.callback.UsernameCallback;
import com.sagar.springmvcmaster.exception.ProductNotFoundException;
import com.sagar.springmvcmaster.model.CustemerDetails;
import com.sagar.springmvcmaster.model.Product;
import com.sagar.springmvcmaster.service.CustemerService;
import com.sagar.springmvcmaster.service.ProductService;


@Controller
@SessionAttributes("productCart")
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productservice;
	@Autowired
	CustemerService cService;
	
	
	@RequestMapping("/home")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/saveuser")
	public String addCustemers(CustemerDetails custemer) {
		System.out.println("in custemerCONTROLLER");
		cService.addCustemer(custemer);
		return "redirect:/products/all";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public String getAllProducts(ModelMap model) {
		System.out.println("In all product method");
		List<Product> product = productservice.getAllProducts();
		model.addAttribute("products", product);
		return "allproducts";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public String fetchAllProducts(ModelMap model) {
		System.out.println("In list method");
		List<Product> product = productservice.getAllProducts();
		System.out.println(product);
		model.addAttribute("products", product);
		
		return "show";
	}

	@RequestMapping(method = RequestMethod.GET, value = "category")
	public String getProductsByCategory(@PathVariable("category") String category, ModelMap model) {
		System.out.println("this is controller");
		List<Product> product = productservice.getProductsByCategory(category);
		model.addAttribute("products", product);
		return "allproducts";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getProductById(@RequestParam("id") String productId, ModelMap model) throws ProductNotFoundException {
		Product product = productservice.getProductById(productId);
		model.addAttribute("products", product);
		return "oneproduct";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public String displayProductForm(ModelMap model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addproduct";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public String admin1() {

		return "admin";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String submitProduct(@ModelAttribute("addProduct") @Valid Product product, HttpServletRequest request,
			BindingResult result) {
		if (result.hasErrors())
			return "redirect:/products/add";
		MultipartFile productImage = product.getProductImage();
		String filePath = request.getSession().getServletContext().getRealPath("/");
		try {
			productImage.transferTo(new File(filePath + "resources\\images\\" + product.getName() + ".jpg"));
			productservice.addProduct(product);
		} catch (Exception e) {
		}

		return "redirect:/products/all";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/delete")
	public String DeleteProductById(@RequestParam("id") String productId) {
		productservice.DeleteProductById(productId);
		System.out.println(productId);
		return "redirect:/products/all";

	}

	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView ProductNotFound(ProductNotFoundException ex, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("invalidProductId", ex.getProductId());
		mv.addObject("message", ex.getMessage());
		mv.addObject("url", request.getRequestURL() + "?" + request.getQueryString());
		mv.setViewName("productNotFound");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addtocart")
	public String addProductToCart(ModelMap model, @RequestParam("productId") String productId,
			HttpServletRequest request) throws ProductNotFoundException {
		Product product = productservice.getProductById(productId);
		System.out.println(product);
		if (request.getSession().getAttribute("productCart") == null) {
			List<Product> products = new ArrayList<Product>();
			products.add(product);
			model.addAttribute("productCart", products);

		}

		else

		{

			@SuppressWarnings("unchecked")
			List<Product> products = (List<Product>) request.getSession().getAttribute("productCart");
			products.add(product);
			System.out.println(products);
			model.addAttribute("productCart", products);

		}
		return "welcome";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/order")
	public String bookProduct() {
		System.out.println("this is book product method");
		return "order";
	}
	
		
	

}
