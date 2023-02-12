package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement toclick=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		toclick.click();
		WebElement toclick1=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		toclick1.click();
		WebElement enterusername=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	    enterusername.sendKeys("jackie");
	    WebElement enterpass=driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	    enterpass.sendKeys("23443");
	    WebElement tologin=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    tologin.click();
	    
		
	
	}

}
