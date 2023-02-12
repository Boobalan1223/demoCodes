package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement enterName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
	
		
		//enterName.click();
		
	
		
		enterName.sendKeys("jackie");
		
		WebElement enterLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		enterLastName.sendKeys("Billa");
		WebElement adress =driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		adress.sendKeys("2,krishna puram st, vadakarai, periyakulam,theni");
		WebElement email= driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("1234@gmail.com");
		WebElement phoneNumber= driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneNumber.sendKeys("133343");
		WebElement gender= driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		WebElement hobbies=driver.findElement(By.xpath("//input[@value='Cricket']"));
		hobbies.click();
		WebElement hobbies2=driver.findElement(By.xpath("//input[@value='Movies']"));
		hobbies2.click();
		
		//WebElement languages= driver.findElement(By.id("msdd"));
		//languages.sendKeys("Tamil, English");
		
		
		
		
		
	}

}
