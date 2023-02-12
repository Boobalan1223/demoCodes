package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	//	click.click();
		//WebElement click2 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		//click2.click();
	//	Alert alert = driver.switchTo().alert();
		//alert.dismiss();
	//	Thread.sleep(3000);
		WebElement click4 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		click4.click();
		WebElement click3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		click3.click();
		Alert alert1= driver.switchTo().alert();
		alert1.sendKeys("hello da punda");
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
	}

}
