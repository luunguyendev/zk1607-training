package com.springweb.dao;

import java.util.List;

import org.bson.Document;

/**
 * CommonDao
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
public interface CommonDao {
	
	Long count();
	void insert(Document document);
	void insert(List<Document> listDocument);
	void update(Document document);
	void update(List<Document> listDocument);
	Document find(String id);
	List<Document> findAll();
	void delete(Document document);
}
