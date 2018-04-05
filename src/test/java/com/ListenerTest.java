package com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("Test method on Finish: "+ arg0.getName());
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Test Method onStart: "+arg0.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Method Failed:" + arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Method Skipped: "+arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Method onstart"+arg0.getName());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Method Success: "+arg0.getName());
		
	}

	
}
