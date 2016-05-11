package com.springweb.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.domain.Customer;
import com.springweb.facade.CustomerService;

@Controller
public class CustomerController {
	
	private CustomerService customerService;
	
	@RequestMapping(value = "/initialize", method = RequestMethod.GET)
	public void initialize() {
		Customer customer = new Customer();
		customer.setFirstName("My FirstName");
		customer.setLastName("My LastName");
		customer.setGender(Boolean.TRUE);
		customer.setDob(new Date());
		customerService.insertOne(customer);
	}
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	@Autowired(required = true)
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
