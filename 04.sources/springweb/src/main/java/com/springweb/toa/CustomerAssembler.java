package com.springweb.toa;

import java.util.List;

import org.bson.Document;

import com.springweb.domain.Customer;

/**
 * CustomerAssembler
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
public interface CustomerAssembler {
	
	Customer parse(Document document);
	List<Customer> parseMany(List<Document> listDocument);
	Document toDocument(Customer customer);
	List<Document> toDocumentMany(List<Customer> listCustomer);
}
