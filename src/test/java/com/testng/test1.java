package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
		
	@BeforeMethod
	public void m9() {
		System.out.println("Before Method ");
	}
	
	@Test
	public void m1() {
		System.out.println("test1--> test method m1");
	}
		
	@AfterSuite
	public void m6() {
		System.out.println("after suite ");
	}

}
