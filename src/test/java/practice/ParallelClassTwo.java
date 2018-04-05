package practice;

import org.testng.annotations.Test;

public class ParallelClassTwo {

	@Test
	public void testCaseOne() {
		System.out.println("Test Case One in "+getClass().getName()
				+ " with Thread ID: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCaseTwo() {
		System.out.println("Test case two in "+ getClass().getName()
				+ " with Thread ID: "+ Thread.currentThread().getId());
	}
}
