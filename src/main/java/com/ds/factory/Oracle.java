package com.ds.factory;

public class Oracle extends Database{

	public Oracle() {
		setDriverName("oracle.jdbc.driver.OracleDriver");
		setUserName("scott");
	}
}
