package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement click = driver.findElement(By.xpath("//div[@id='heading20']"));
	click.click();
	WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
    Actions ac = new Actions(driver);
    ac.contextClick(cts).perform();
    Robot rb=new Robot();
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
}
}
