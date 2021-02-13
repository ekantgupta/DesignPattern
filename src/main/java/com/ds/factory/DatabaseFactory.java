package com.ds.factory;

public class DatabaseFactory {
	
	public DatabaseFactory () throws IllegalAccessException {
		throw new IllegalAccessException("Object Can not be created ");
	}
	
	public static Database getDatabaseInstance(DatabaseType type) {
		switch (type) {
		case MYSQL:
			return new MySQL();
		case ORACLE:
			return new Oracle();
		case MONGODB:
			return new MongoDB();
		default:
			return null;
		}
	}

}
