package com;

import org.testng.annotations.DataProvider;

public class DataproviderClass {

	@DataProvider(name="DifferentData")
	public Object[][] data() {
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="Suhas";
		obj[0][1]="1234";
		obj[1][0]="Ruthvika";
		obj[1][1]="7890";
		
		return obj;
		
	}
	
}
