package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		//Thread.sleep(3000);
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);
		WebElement drag2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement drop2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		ac.dragAndDrop(drag2, drop2).perform();
		Thread.sleep(3000);
	WebElement drag3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement drop3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	ac.dragAndDrop(drag3, drop3).perform();
		
		
	
		
		
	}

}
