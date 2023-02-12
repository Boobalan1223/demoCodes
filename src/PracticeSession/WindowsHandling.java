package PracticeSession;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Google pixel 6a");
		WebElement Navigate = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Navigate.click();
		Thread.sleep(3000);
	    WebElement mobile = driver.findElement(By.xpath("(//span[contains(text(),'Google Pixel 6a 5G (Chalk, 6GB RAM, 128GB Storage)')])[1]"));
		mobile.click();
		WebElement Mobile2 = driver.findElement(By.xpath("(//span[contains(text(),'Google Pixel 6a (Charcoal, 128 GB) (6 GB RAM)')])[2]"));
		Mobile2.click();
		String s1= "(//span[contains(text(),'Google Pixel 6a 5G (Chalk, 6GB RAM, 128GB Storage)')])[1]";
		String s2="(//span[contains(text(),'Google Pixel 6a (Charcoal, 128 GB) (6 GB RAM)')])[2]";
//		WebElement Addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
//	    Addcart.click();
	String parentWindow = driver.getWindowHandle();
     	Set<String> childWindows = driver.getWindowHandles();
		for (String string : childWindows) {
			if (!parentWindow.equals(string)) {
				if (string==s1) { 
				driver.switchTo().window(string);
				WebElement Addcart = driver.findElement(By.xpath(""));
				Addcart.click();
				}
				  
			if (string==s2) {
				driver.switchTo().window(string);
				WebElement PrintPrice = driver.findElement(By.xpath("(//span[text()='₹26,990'])[2]"));
				System.out.println(PrintPrice);
				
				
			}
		
//	switch (childWindows) {
//	case value:
//		
//		break;
//
//	default:
//		break;
//	}
		}
		}}}

			
		
		
	
	
	


