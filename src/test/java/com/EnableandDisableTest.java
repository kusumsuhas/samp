package com;

import org.testng.annotations.Test;

public class EnableandDisableTest {

	@Test(enabled = true)
	public void firstTest() {
		System.out.println("In First Test");
	}
	
	@Test(enabled = false)
	public void SecondTest() {
		System.out.println("In Second Test");
	}
	
}
