package com.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	@BeforeSuite
	public void m1() {
		System.out.println("before suite -- m1");
	}
	@BeforeTest
	public void a2() {
		System.out.println("before test --- m2");
	}	
	@BeforeClass
	public void a3() {
		System.out.println("before class -- m3");
	}	
	@Test//(enabled = false)
	public void logIn() {
		System.out.println("Before Method --  logIn m4");
		String actual ="mbait";
		String expected = "Mbait";
		//assertEquals(actual, expected);	
		assertNotSame(actual, expected);
	}	
	 @Test
	public void a9() {
		System.out.println("test");
	}	
	@Test(dependsOnMethods = "logIn") 	
	public void registration() {
		System.out.println("after method -- registration m5");
	}	
	@AfterClass
	public void a8() {
		System.out.println("after class -- m8");
	}	
	@AfterTest
	public void a7() {
		System.out.println("after test --- m7");
	}	
	@AfterSuite
	public void a6() {
		System.out.println("after suite -- m6");
	}
}
