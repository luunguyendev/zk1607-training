package com.springweb.toa;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;

import com.springweb.domain.Customer;
import com.springweb.utils.StringUtils;

/**
 * CustomerAssemblerImpl
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
@Service
public class CustomerAssemblerImpl implements CustomerAssembler {
	
	private static final String _CUSTOMERID = "_id";
	private static final String _CUSTOMERNO = "_customerno";
	private static final String _FIRSTNAME = "_firstname";
	private static final String _LASTNAME = "_lastname";
	private static final String _DOB = "_dob";
	private static final String _GENDER = "_gender";
	private static final String _EMAIL = "_email";
	private static final String _ADDRESS = "_address";
	private static final String _IDCARD = "_idcard";
	private static final String _IDPLACE = "_idplace";
	private static final String _IDDATE = "_iddate";
	private static final String _ACTIVEDATE = "_activedate";
	private static final String _CREATEDON = "_createdon";
	private static final String _MODIFIEDON = "_modifiedon";
	private static final String _UPDATECOUNTER = "_updatecounter";
	
	@Override
	public Customer parse(Document document) {
		Customer customer = new Customer();
		if (null != document) {
			customer.setCustomerId(document.getString(_CUSTOMERID));
			customer.setFirstName(document.getString(_CUSTOMERNO));
			customer.setLastName(document.getString(_LASTNAME));
			customer.setDob(document.getDate(_DOB));
			customer.setGender(document.getBoolean(_GENDER));
			customer.setEmail(document.getString(_EMAIL));
			customer.setAddress(document.getString(_ADDRESS));
			customer.setIdCard(document.getString(_IDCARD));
			customer.setIdPlace(document.getString(_IDPLACE));
			customer.setIdDate(document.getString(_IDDATE));
			customer.setActiveDate(document.getDate(_ACTIVEDATE));
			customer.setCreatedOn(document.getDate(_CREATEDON));
			customer.setModifiedOn(Timestamp.valueOf(document.getString(_MODIFIEDON)));
			customer.setUpdateCounter(document.getLong(_UPDATECOUNTER));
		}
		return customer;
	}

	@Override
	public List<Customer> parseMany(List<Document> listDocument) {
		List<Customer> listCustomer = new ArrayList<Customer>();
		if (!listDocument.isEmpty()) {
			for (Document document : listDocument) {
				listCustomer.add(parse(document));
			}
		}
		return listCustomer;
	}

	@Override
	public Document toDocument(Customer customer) {
		Document document = new Document();
		if (null != customer) {
			if (StringUtils.isNotEmpty(customer.getCustomerId())) {
				document.put(_CUSTOMERID, customer.getCustomerId());
			}
			document.put(_CUSTOMERNO, customer.getCustomerNo());
			document.put(_FIRSTNAME, customer.getFirstName());
			document.put(_LASTNAME, customer.getLastName());
			document.put(_DOB, customer.getDob());
			document.put(_GENDER, customer.getGender());
			document.put(_EMAIL, customer.getEmail());
			document.put(_ADDRESS, customer.getAddress());
			document.put(_IDCARD, customer.getIdCard());
			document.put(_IDPLACE, customer.getIdPlace());
			document.put(_IDDATE, customer.getIdDate());
			document.put(_ACTIVEDATE, customer.getActiveDate());
			document.put(_CREATEDON, customer.getCreatedOn());
			document.put(_MODIFIEDON, customer.getModifiedOn());
			document.put(_UPDATECOUNTER, customer.getUpdateCounter());
		}
		return document;
	}

	@Override
	public List<Document> toDocumentMany(List<Customer> listCustomer) {
		List<Document> listDocument = new ArrayList<Document>();
		if (!listCustomer.isEmpty()) {
			for(Customer customer : listCustomer) {
				listDocument.add(toDocument(customer));
			}
		}
		return listDocument;
	}
}
