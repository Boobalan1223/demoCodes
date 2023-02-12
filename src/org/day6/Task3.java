package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement clickbtn = driver.findElement(By.xpath("//input[@type='text']"));
		//clickbtn.click();
		clickbtn.sendKeys("123445535");
		WebElement click2 = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	click2.click();
	}

}
