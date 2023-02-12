package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver. get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	    WebElement enterFirstName=driver.findElement(By.id("firstName"));
	    enterFirstName.sendKeys("jackie");
	    WebElement enterLastName=driver.findElement(By.id("lastName"));
	    enterLastName.sendKeys("billa");
	    WebElement enterEmail=driver.findElement(By.id("userEmail"));
        enterEmail.sendKeys("1231@gmail.com");
        WebElement gender= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();
        WebElement phoneNum= driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        phoneNum.sendKeys("234325");
        WebElement subject= driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        subject.click();
        subject.sendKeys("maths,tamil");
        
        }

}
