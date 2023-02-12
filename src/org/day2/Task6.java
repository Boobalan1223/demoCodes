package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/m/trains");
	WebElement txtfrom=driver.findElement(By.id("from_station"));
	txtfrom.sendKeys("chennai");
	WebElement txtTo=driver.findElement(By.id("to_station"));
	txtTo.sendKeys("madurai");
	WebElement toClick=driver.findElement(By.xpath("//button[@type='submit']"));
	
	
	toClick.click();
}
}
