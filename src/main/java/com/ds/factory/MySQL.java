package com.ds.factory;

public class MySQL extends Database{
	
	public MySQL() {
		setDriverName("com.mysql.jdbc.Driver");
		setUserName("mySQL");
	}

}
