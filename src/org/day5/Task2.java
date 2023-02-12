package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		WebElement entername = driver.findElement(By.xpath("//input[@name='q']"));
	entername.sendKeys("vel murugan");
	Actions ac=new Actions(driver);
	ac.doubleClick(entername).perform();
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyPress(KeyEvent.VK_X);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_X);
	}


}
