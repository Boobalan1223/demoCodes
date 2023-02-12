package PracticeSession;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
   public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://adactinhotelapp.com/");
//	driver.manage().window().maximize();
//	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//	username.sendKeys("jackiebilla");
//	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//	password.sendKeys("9489137317b");
//	WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
//	login.click();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone13pro");
	WebElement icon = driver.findElement(By.id("nav-search-submit-button"));
	icon.click();
	WebElement first = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 13 Pro (128GB) - Graphite')])[3]"));
	Actions a = new Actions(driver);
	a.contextClick(first).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String parentid = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	for (String all : child) {
		if (!all.equals(parentid)) {
			
		
		driver.switchTo().window(all);
		WebElement amt = driver.findElement(By.xpath("(//span[text()='1,11,900'])[1]"));
		String text = amt.getText();
		System.out.println(text);
		Thread.sleep(10000);
		
		
	}}
}
}
