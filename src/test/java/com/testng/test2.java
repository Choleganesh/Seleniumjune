package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test2 {
		
	@BeforeClass
	public void m3() {
		System.out.println("before class ");
	}
	
	@Test
	public void m2() {
		System.out.println("test2--> test method m2");
	}
	
	@AfterMethod	
	public void m5() {
		System.out.println("after method ");
	}
	
	/*@AfterTest
	public void m7() {
		System.out.println("after test ");
	}*/	
		
}
