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

public class Task5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement srch = driver.findElement( By.xpath("//input[@id='inputValEnter']"));
		srch.sendKeys("hp laptops",Keys.ENTER);
		TakesScreenshot sh=(TakesScreenshot)driver;
		File f1 = sh.getScreenshotAs(OutputType.FILE);
		System.out.println();
		File f2=new File("D:\\Java\\snap.jpg");
		FileUtils.copyFile(f1, f2);
	    
	}

}
