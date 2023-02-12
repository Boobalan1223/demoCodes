package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement btnClick = driver.findElement(By.xpath("//div[@class='card-headercore-java d-flex align-items-center justify-content-between']"));
		btnClick.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File shot= ts.getScreenshotAs(OutputType.FILE);
		System.out.println(shot);
		Thread.sleep(3000);
		File f = new File("D:\\Java\\gf.jpg");
		FileUtils.copyFile(shot, f);
		
	}

}
