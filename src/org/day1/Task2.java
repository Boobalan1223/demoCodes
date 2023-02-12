package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("https://www.redbus.in/");
		WebElement textFrom= bond.findElement(By.className("db"));
		textFrom.sendKeys("Madurai");
		WebElement textTo = bond.findElement(By.id("dest"));
		textTo.sendKeys("Chennai");
		bond.quit();
		System.out.println("Boobalan");
		
		
	}

}
