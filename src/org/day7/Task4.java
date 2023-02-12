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
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement btnClick = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		btnClick.click();
		Thread.sleep(3000);
		WebElement moushover = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
		Actions mh=new Actions(driver);
		mh.moveToElement(moushover).perform();
		TakesScreenshot sh=(TakesScreenshot)driver;
		File screenshotAs = sh.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File sh1=new File("D:\\Java\\ssh.jpg");
		FileUtils.copyFile(screenshotAs, sh1);
		
		
	}

}
