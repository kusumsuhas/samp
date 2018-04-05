package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	@Parameters({"Testpara2"})
	@Test
	public void test(String para1) {
		System.out.println("Second Class - Test Level Para: "+ para1);
	}
}
