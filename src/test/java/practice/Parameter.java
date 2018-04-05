package practice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Parameters( {"browser"})
	@Test
	public void Test2(@Optional("Optional") String br) {
		System.out.println("Browser Name is: "+ br);
	}
	
	@Parameters({"uname","pwd"})
	@Test 
	public void test(String uname, String pwd) {
		System.out.println("User Name is: "+ uname);
		System.out.println("Password is: "+ pwd);
	}
}

