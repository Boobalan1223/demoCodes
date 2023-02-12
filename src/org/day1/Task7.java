package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver bond = new ChromeDriver();
		bond.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement textUserName= bond.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP'][1]"));
		textUserName.click();
		
		textUserName.sendKeys("billa");
		
		

}
}
