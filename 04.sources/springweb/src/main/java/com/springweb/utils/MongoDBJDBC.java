package com.springweb.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * MongoDBJDBC
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
public class MongoDBJDBC {
	
	private static MongoDatabase instance = null;
	
	@SuppressWarnings("resource")
	public static MongoDatabase getInstance() {
		if (instance == null) {
			synchronized (MongoDatabase.class) {
				if (instance == null) {
					try {
						MongoClient mongoClient = new MongoClient(DBConfig.DB_HOST, DBConfig.DB_PORT);
						instance = mongoClient.getDatabase(DBConfig.DB_NAME);
					} catch (Exception e) {
						System.err.println( e.getClass().getName() + ": " + e.getMessage() );
					}
				}
			}
		}
		return instance;
	}
}
