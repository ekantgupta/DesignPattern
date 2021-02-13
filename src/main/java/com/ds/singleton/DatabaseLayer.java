package com.ds.singleton;

//Double checking single ton
public class DatabaseLayer {
	
	private static volatile DatabaseLayer db;
	
	private DatabaseLayer () {
		// This code is preventing to create object from reflection
		if(db != null) {
			throw new RuntimeException("Please create object from getDBInstance() method");
		}
	}

	public static DatabaseLayer getDBInstance() {
		// Double checking singleton to avoid create multiple object in Multi threaded case.
		if(db == null) {
			synchronized (DatabaseLayer.class) {
				if(db == null) {
					db = new DatabaseLayer();
				}
			}
		}
		
		return db;
	}
	
}
