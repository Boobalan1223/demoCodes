package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("http://adactinhotelapp.com/");
		WebElement textUserName= bond.findElement(By.id("username"));
		textUserName.sendKeys("billa");
		WebElement textpassword= bond.findElement(By.id("password"));
		textpassword.sendKeys("2323");
	   
	}
}
