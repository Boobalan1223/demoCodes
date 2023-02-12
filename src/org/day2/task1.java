package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement toEnter=driver.findElement(By.id("twotabsearchtextbox"));
		toEnter.sendKeys("i phone");
		WebElement toClick=driver.findElement(By.xpath("//input [@id='nav-search-submit-button']"));
		toClick.click();
		
	}

}
