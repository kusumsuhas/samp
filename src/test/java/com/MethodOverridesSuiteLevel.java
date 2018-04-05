package com;

import org.testng.annotations.Test;

public class MethodOverridesSuiteLevel {

	  @Test(timeOut = 1000)
	    public void timeTestOne() throws InterruptedException
	    {
	        Thread.sleep(2500);
	        System.out.println("Paused execution for 2.5 Seconds");
	    }
	     
	    @Test
	    public void timeTestTwo() throws InterruptedException
	    {
	        Thread.sleep(2500);
	        System.out.println("Paused execution for 2.5 Seconds");
	    }
}
