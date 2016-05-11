package com.springweb.dao;

import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.client.model.Filters;

/**
 * CustomerImpl
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
@Repository
public class CustomerImpl extends CommonImpl implements CustomerDao {
	
	private static final String COLLECTION_NAME = "TBL_CUSTOMER";
	
	public CustomerImpl() {
		super(COLLECTION_NAME);
	}

	@Override
	public Document findByNo(String customerNo) {
		return collection.find(Filters.eq("_customerno", customerNo)).first();
	}
	
	@Override
	public Document findByEmail(String email) {
		return collection.find(Filters.eq("_email", email)).first();
	}

	@Override
	public Long count(String id) {
		return collection.count(Filters.eq("_id", id));
	}
}
