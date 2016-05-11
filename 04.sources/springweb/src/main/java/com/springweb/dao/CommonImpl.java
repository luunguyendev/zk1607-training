package com.springweb.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.springweb.utils.MongoDBJDBC;

/**
 * CommonImpl
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
@Repository
public abstract class CommonImpl implements CommonDao {
	
	protected MongoDatabase database = MongoDBJDBC.getInstance();
	protected MongoCollection<Document> collection;
	
	protected CommonImpl(String collectionName) {
		collection = database.getCollection(collectionName) ;
	}
	
	@Override
	public Long count() {
		return collection.count();
	}
	
	@Override
	public void insert(Document document) throws MongoException {
		collection.insertOne(document);
	}
	
	@Override
	public void insert(List<Document> listDocument) throws MongoException {
		collection.insertMany(listDocument);
	}

	@Override
	public void update(Document document) throws MongoException {
		collection.updateOne(Filters.eq("_id", document.get("_id")), document);
	}
	
	@Override
	public void update(List<Document> listDocument) throws MongoException {
		//collection.updateMany(Filters.eq("_id", listDocument.get("_id")), listDocument);
	}
	
	@Override
	public Document find(String id) {
		return collection.find(new Document("_id", id)).first();
	}
	
	@Override
	public List<Document> findAll() {		
		return collection.find().into(new ArrayList<Document>());
	}
	
	@Override
	public void delete(Document document) {
		collection.findOneAndDelete(document);
	}
}
