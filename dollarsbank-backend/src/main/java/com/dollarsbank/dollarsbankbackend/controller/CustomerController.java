package com.dollarsbank.dollarsbankbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollarsbank.dollarsbankbackend.model.Customer;
import com.dollarsbank.dollarsbankbackend.service.CustomerService;

@RestController
@RequestMapping("/dollars-bank")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/add")
	public String add(@RequestBody Customer customer) {
		
		service.createCustomer(customer);
		
		return "New customer is added";
		
	}
	
}