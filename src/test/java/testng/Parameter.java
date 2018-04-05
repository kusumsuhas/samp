package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Parameters({"Testpara1", "Testpara2"})
	@Test 
	public void test(String para1, String para2) {
		
		System.out.println("Parameter1: "+para1);
		System.out.println("Parameter2: "+ para2);
	}
	
	
	@Parameters({"Testpara1"})
	@Test
	public void test1(String para1) {
		System.out.println("Parameters 1: "+para1 );
	}
}
