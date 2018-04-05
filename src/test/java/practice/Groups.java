package practice;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups="Regression")
	public void testcaseone() {
		System.out.println("In Regression group - Test Case one");
	}
	
	@Test (groups= {"sanity test"}, priority=0)
	public void testcasetwo() {
		System.out.println("In Sanity Group - Test case One");
	}
	
	@Test (groups= {"Regression"}, priority=0)
	public void testcasethree(){
		System.out.println("In Regre case twossion Group - Teat");
	}
	
	@Test (groups= {"Regression", "sanity test"}, priority=2)
	public void Testcasefour() {
		System.out.println("IN Regression and Sanity Group");
	}
}
