package PracticeSession;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement hover = driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions a= new Actions(driver) ;
	a.moveToElement(hover).perform();
	WebElement click = driver.findElement(By.id("multiasins-img-link"));
	click.click();
	TakesScreenshot ts= (TakesScreenshot) (driver);
	File f1 = ts.getScreenshotAs(OutputType.FILE);
	File f2= new File("D:\\Java\\sonu.jpg");
	FileUtils.copyFile(f1, f2);

}
}
