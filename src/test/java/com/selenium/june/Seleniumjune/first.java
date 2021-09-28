package com.selenium.june.Seleniumjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class first extends Appconsta{
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = browserInit();
		driver.get("http://demo.automationtesting.in/Register.html");		
		
		Thread.sleep(2000);
		driver.close();
	}
}
