package com.sagar.springmvcmaster.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sagar.springmvcmaster.model.User;
import com.sagar.springmvcmaster.service.ProductService;

@Controller
@RequestMapping("/normal")
public class HomeController {
	private String msg="";
	@Autowired
	ProductService productservice;
	@RequestMapping("/home")
	public String welcome() {
		return "welcome";
	}
	 
	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public String admin(User user , RedirectAttributes redirAttrs,HttpServletRequest request) {
		
	
		if(user.getUsername().equals("Admin") && user.getPassword().equals("Admin")||user.getUsername().equals("sagar")&& user.getPassword().equals("12345"))
		{
			System.out.println("You enterd correct pass");
			//for massage given on webpage
			this.msg="Login Success";
			request.setAttribute("massege",msg);		
			return "admin";
		}
		else {
			System.out.println("Please Enter correct details");
			redirAttrs.addFlashAttribute("error", "Please Enter correct Username & password");
			this.msg="Login fail....please enter correct username or password";
			request.setAttribute("massege",msg);
		}

		 return "welcome";
	}

	

}
