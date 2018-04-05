package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggerTest {

	@Test
	public void Success() {
		
		Assert.assertEquals("a", "a");
	}
	
	@Test
	public void Fail() {
		Assert.assertEquals("a", "b");
	}
}
