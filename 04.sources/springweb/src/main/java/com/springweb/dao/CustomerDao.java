package com.springweb.dao;

import org.bson.Document;

/**
 * CustomerDao
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
public interface CustomerDao extends CommonDao{
	
	Document findByNo(String customerNo);
	Document findByEmail(String email);
	Long count(String id);
}
