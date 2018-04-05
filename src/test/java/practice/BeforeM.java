package practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeM {

	@BeforeMethod() 
	public void a() {
		System.out.println("A");
	}
	
	@Test
	public void b() {
		System.out.println("B");
	}
	
	@Test
	public void c() {
		System.out.println("C");
	}
}

