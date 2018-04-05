package practice;

import org.testng.annotations.Test;

public class ParallelClassOne {

	@Test (invocationCount=5)
	public void testCase1() {
		System.out.println("Test case ONE in "+ getClass().getName()
				+ " with Thread ID: "+ Thread.currentThread().getId() );
	}
	
	@Test
	public void testCaseTwo() {
		System.out.println("Test Case TWO in "+ getClass().getName()
				+" with Thread ID:" + Thread.currentThread().getId());
	}
}
