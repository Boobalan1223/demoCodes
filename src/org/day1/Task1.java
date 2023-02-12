package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	
		WebElement txtUsername =driver.findElement(By.id("email"));
		txtUsername.sendKeys("Robert");
		WebElement txtPassword= driver.findElement(By.id("pass"));
		txtPassword.sendKeys("12345678");
		driver.quit();	
		
		
		
	
	}

}
