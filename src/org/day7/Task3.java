package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement scrh = driver.findElement(By.xpath("//input[@type='text']"));
		scrh.sendKeys("motorola",Keys.ENTER);
		TakesScreenshot ss=(TakesScreenshot)driver;
		File ss1 = ss.getScreenshotAs(OutputType .FILE);
		System.out.println(ss1);
		File f=new File("D:\\Java\\ss.jpg");
		FileUtils.copyFile(ss1, f);
		
		
		
	}

}
