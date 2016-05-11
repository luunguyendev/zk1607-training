package com.springweb.facade;

import java.util.List;

import com.springweb.domain.Customer;

/**
 * CustomerService
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */

public interface CustomerService {
	
	Long count();
	Long count(String id);
	void insertOne(Customer customer);
	void insertMany(List<Customer> listCustomer);
	void updateOne(Customer customer);
	void updateMany(List<Customer> listCustomer);
	List<Customer> findAll();
	Customer findById(String id);
	Customer findByNo(String customerNo);
	Customer findByEmail(String email);
}
