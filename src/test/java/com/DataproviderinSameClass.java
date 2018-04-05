package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderinSameClass {

	@DataProvider(name="data")
	public Object[][] getdata() {		
		return new Object[][] 				{
			{"data one"}, {"data two"}
				};
	}
	
	@DataProvider(name="getdata")
	public Object[][] getdata1() {
		Object[][] data = new Object[2][2];
		
		data[0][0]="Ravindra";
		data[0][1]="5000";
		data[1][0]="Rajendra";
		data[1][1]="70000";
		return data;
	}
	
	
	@Test(dataProvider="data")
	public void Test(String data)
	{
		System.out.println("Data Provided by Dataproovider is: "+data);
	}
	
	@Test(dataProvider="getdata")
	public void Test2(String fname, String sal) {
		System.out.println("Name: "+ fname);
		System.out.println("Salary: "+sal);
	}
	
	@Test (dataProvider="DifferentData", dataProviderClass=com.DataproviderClass.class)
	public void Test3(String name, String no) {
		System.out.println("name is: "+name);
		System.out.println("Nukber is: "+no);
	}
}
