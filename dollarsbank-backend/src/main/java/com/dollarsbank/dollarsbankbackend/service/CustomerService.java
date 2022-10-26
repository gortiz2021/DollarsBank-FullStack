package com.dollarsbank.dollarsbankbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollarsbank.dollarsbankbackend.model.Customer;
import com.dollarsbank.dollarsbankbackend.repository.CustomerRepository;

@Service
public class CustomerService{
	
	@Autowired 
	private CustomerRepository repo;
	
	public Customer createCustomer(Customer customer) {
		
		repo.save(customer);
		
		return customer;
		
	}
}