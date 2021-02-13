package com.ds.factory;

public abstract class Database {
	
	private String userName;
	private String DriverName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	
	public void showDatabase() {
		System.out.println(getDriverName());
		System.out.println(getUserName());
	}
	

}
