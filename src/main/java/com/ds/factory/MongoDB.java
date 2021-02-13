package com.ds.factory;

public class MongoDB extends Database{

	public MongoDB() {
		setDriverName("jdbc:mongo//url");
		setUserName("admin");
	}
}
