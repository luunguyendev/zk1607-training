package com.springweb.facade;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.MongoException;
import com.springweb.dao.CustomerDao;
import com.springweb.domain.Customer;
import com.springweb.toa.CustomerAssembler;

/**
 * CustomerFacade
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
@Service
public class CustomerFacade implements CustomerService {
	
	private CustomerAssembler customerAssembler;
	private CustomerDao customerDao;

	@Override
	public Long count(){
		return customerDao.count();
	}
	
	@Override
	public Long count(String id){
		return customerDao.count(id);
	}
	
	@Override
	public void insertOne(Customer customer) throws MongoException {
		Document document = customerAssembler.toDocument(customer);
		customerDao.insert(document);
	}
	
	@Override
	public void insertMany(List<Customer> listCustomer) throws MongoException {
		List<Document> listDocument = customerAssembler.toDocumentMany(listCustomer);
		customerDao.insert(listDocument);
	}
	
	@Override
	public void updateOne(Customer customer) {
		Document document = customerAssembler.toDocument(customer);
		customerDao.update(document);
	}

	@Override
	public void updateMany(List<Customer> listCustomer) {
		List<Document> listDocument = customerAssembler.toDocumentMany(listCustomer);
		customerDao.update(listDocument);
	}
	
	@Override
	public List<Customer> findAll() {
		List<Document> listDocument = customerDao.findAll();
		return customerAssembler.parseMany(listDocument);
	}

	@Override
	public Customer findById(String id) {
		Document document = customerDao.find(id);
		return customerAssembler.parse(document);
	}

	@Override
	public Customer findByNo(String customerNo) {
		Document document = customerDao.findByNo(customerNo);
		return customerAssembler.parse(document);
	}

	@Override
	public Customer findByEmail(String email) {
		Document document = customerDao.findByEmail(email);
		return customerAssembler.parse(document);
	}
	
	public CustomerAssembler getCustomerAssembler() {
		return customerAssembler;
	}

	@Autowired(required = true)
	public void setCustomerAssembler(CustomerAssembler customerAssembler) {
		this.customerAssembler = customerAssembler;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	@Autowired(required = true)
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
}
