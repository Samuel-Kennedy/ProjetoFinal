package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.ProductsModel;
import com.example.dao.ProductService;

@Controller
public class ProductsController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String showNewProductPage(Model model) {
		
		ProductsModel product = new ProductsModel();
		model.addAttribute("product", product);
		
		return "index";
	}
	
	@RequestMapping("/inicial")
	public String viewHomePage(Model model) {
		//List<ProductsModel> listProducts = service.listAll();		
		model.addAttribute("product", new ProductsModel());
		return "inicial";
	}
	
	@RequestMapping("/editar/{id}")
	public String viewHomePage(@PathVariable(name="id")long id, Model model) {
		//List<ProductsModel> listProducts = service.listAll();		
		model.addAttribute("product", service.get(id));
		return "inicial";
	}
	
	@RequestMapping("/lista")
	public String viewListaPage(Model model) {
		List<ProductsModel> listProducts = service.listAll();
		//ProductsModel product = new ProductsModel();
		model.addAttribute("products", listProducts);	
		return "lista";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id")long id) {
		ModelAndView mav = new ModelAndView("edit");
		ProductsModel product = service.get(id);
		mav.addObject("product", product);
		return mav;
	}
	@RequestMapping("save")
	public String saveProduct(ProductsModel product) {
		
		service.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") long id){
		service.delete(id);
		return "redirect:/";
	}
}

