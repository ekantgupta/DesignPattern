package com.ds.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter 1 for Mysql !!");
		System.out.println("Please enter 2 for Oracle !!");
		System.out.println("Please enter 3 for MongoDB !!");
		
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		if(n < 0 && n > 2) {
			System.out.println("Invalid input");
		}else {
			Database db = DatabaseFactory.getDatabaseInstance(DatabaseType.values()[n-1]);
			db.showDatabase();
		}
		
	}

}
