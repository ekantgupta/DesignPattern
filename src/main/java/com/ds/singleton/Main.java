package com.ds.singleton;

public class Main {

	public static void main(String[] args) {
		
		DatabaseLayer db = DatabaseLayer.getDBInstance();
		System.out.println(db);
		
		DatabaseLayer db1 = DatabaseLayer.getDBInstance();
		System.out.println(db1);

	}

}
