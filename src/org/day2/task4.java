

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement toClick= driver.findElement(By.xpath("//div[@id='heading20']"));
	toClick.click();
	WebElement toclick = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	toclick.click();
	}
}
