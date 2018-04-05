package com;

import org.testng.annotations.Test;

public class TimeTestMethodLevel {
    @Test(timeOut = 3000)
    public void timeTestOne() throws InterruptedException
    {
        Thread.sleep(2000);
        System.out.println("Paused execution for 2000 MilliSeconds");
    }
     
    @Test(timeOut = 3000)
    public void timeTestTwo() throws InterruptedException
    {
        Thread.sleep(4000);
        System.out.println("Paused execution for 4000 MilliSeconds");
    }
	
}
