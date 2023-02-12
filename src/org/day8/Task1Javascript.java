package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Javascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement scrch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object executeScript = js.executeScript("arguments[0].set attribute('value','iphone')",scrch );
	}

}
