package com.cg.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
 
import org.springframework.ui.Model;
 
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.Entity.Customer;
 
import com.cg.Service.CustomerService;

@Controller
 
public class CustomerController {
 
	@Autowired
 
	CustomerService service;
 
	@RequestMapping("/")
 
	 public String viewHomePage(Model model) {
 
		List<Customer> listcustomers=service.listAll();
 
		model.addAttribute("listcustomers",listcustomers);
 
		for(Customer c: listcustomers) {
 
			System.out.println("data"+c.getId()+c.getName());
 
		}
 
		return "index";
 
	 }
	
 


}
