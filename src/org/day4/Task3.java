package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(mousehover).perform();
		WebElement btnClick = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	btnClick.click();
	}

}
