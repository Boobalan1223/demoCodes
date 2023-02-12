package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement clickcancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
clickcancel.click();
Thread.sleep(3000);

WebElement linkclick = driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
linkclick.click();
Thread.sleep(3000);

WebElement mouseClick = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
Actions ac = new Actions(driver);
ac.moveToElement(mouseClick).perform();	
Thread.sleep(3000);

WebElement towelClick = driver.findElement(By.xpath("//a[@title=\"Bath Towels\"]"));
			towelClick.click()	;	
			
Thread.sleep(3000);
WebElement text = driver.findElement(By.xpath("//a[text()=\"TRIDENT Cotton 500 GSM Bath Towel Set\"]"));
			
		String	text1=text.getText();
		System.out.println(text1);
			
			
			
			
			
		
		
	}

}
