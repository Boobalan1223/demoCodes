package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).perform();
		WebElement signin = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		signin.click();
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("jackiebilla");
		WebElement num = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		num.sendKeys("9489137317");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("boobala2222@gamil.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("3455463456");
		WebElement contiue = driver.findElement(By.xpath("//input[@id='continue']"));
		
		contiue.click();		
		
		
		
	}


}
