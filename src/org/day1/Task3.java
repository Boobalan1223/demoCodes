package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("https://www.google.com/");
		WebElement textEnter= bond.findElement(By.name("q"));
		textEnter.sendKeys("Greens Technology");
		bond.quit();
}
}