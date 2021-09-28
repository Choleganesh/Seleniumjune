package com.selenium.june.Seleniumjune;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Newtabs extends Appconsta {
	public static void main(String[] args) throws InterruptedException {
		driver = browserInit();
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("Window.open", null);		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		JavascriptExecutor f = (JavascriptExecutor)driver;
		e.executeScript("Window.open", null);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor g = (JavascriptExecutor)driver;
		e.executeScript("Window.open", null);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor h = (JavascriptExecutor)driver;
		e.executeScript("Window.open", null);
		driver.get("https://irctc.in/");

		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
