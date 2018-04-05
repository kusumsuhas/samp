package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEX {

	@Test (dataProvider = "data") 
	public void test(String uname, String pwd) {
		System.out.println("Parameter1: " + uname);
		System.out.println("Parameter2: "+ pwd);
	}
	

	
	@DataProvider(name ="data")
	public Object[][] data() {
		
		Object[][] d = new Object[2][2];
		d[0][0]="Ravindra";
		d[0][1]="Password1";
		d[1][0]="Rajendra";
		d[1][1]="Password2";
		
		return d;
		
	}
	
}
