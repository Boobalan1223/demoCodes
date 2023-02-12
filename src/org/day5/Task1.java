package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));	
	email.sendKeys("email");
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyPress(KeyEvent.VK_X);
	
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_A);
    rb.keyRelease(KeyEvent.VK_X);
    
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	pass.click();
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	
	
	}
	

}
