package testng;

import org.testng.annotations.Test;

public class Groups {

	@Test (groups= {"sanity"})
	public void test1() {
		System.out.println("Sanity Test Execution 1");
	}
	
	@Test (groups = {"regression"})
	public void test2 () {
		System.out.println("Resgression test execution 1");
	}
	
	@Test (groups= {"sanity"})
	public void test3() {
		System.out.println("Sanity Test execution 2");
	}
	
	@Test (groups = {"regression"})
	public void test4() {
		System.out.println("Regression test execution 2");
	}
}
