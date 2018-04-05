package com;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions={ArithmeticException.class})
	public void Test() {
		int i=1/0;
		System.out.println("Value of i"+i);
	}
}
