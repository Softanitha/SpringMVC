package com.example.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvc.entity.Customer;
import com.example.mvc.repository.CustomRepo;

@Controller
public class ControllerMvc {
	
	@Autowired
	CustomRepo repo;
	@GetMapping(value="/")
	public String getMessage() {
		return "home.jsp";
		}
	@PostMapping(value="/addCustomer")
	public String addCustomer(Customer data) {
		repo.save(data);
		
	return "success.jsp";
	}

}
