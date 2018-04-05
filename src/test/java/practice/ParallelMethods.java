package practice;

import org.testng.annotations.Test;

public class ParallelMethods {

	@Test
	public void TestCase1() {
		System.out.println("Test case one with Thread ID: "+Thread.currentThread().getId());
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Test case two with Thread ID:" +Thread.currentThread().getId());
	}
}
