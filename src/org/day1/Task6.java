package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("https://www.snapdeal.com/login");
		WebElement textMobileNumber= bond.findElement(By.id("userName"));
	    textMobileNumber.sendKeys("234324324");
	}
	

}
