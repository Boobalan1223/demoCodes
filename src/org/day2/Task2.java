package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("https://www.facebook.com/");
		WebElement enterUsername =bond.findElement(By.id("email"));
		enterUsername.sendKeys("martin");
		WebElement enterPassword=bond.findElement(By.id("pass"));
		enterPassword.sendKeys("1234455");
		WebElement toLogin = bond.findElement(By.xpath("//button [@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		toLogin.click();
		//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']
	}
}
