package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement toClick=driver.findElement(By.xpath("//a[@id='overview-tab']"));
	toClick.click();
	//Thread.sleep(3000);
	WebElement txtPrint=driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium training')]"));
	Thread.sleep(3000);
	String txt= txtPrint.getText();
	System.out.println(txt);
	
}
}
