package org.day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462756374&hvpos=&hvnetw=g&hvrand=820802961464");
		driver.manage().window().maximize();
		WebElement mv = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions ac=new Actions(driver);
	    ac.moveToElement(mv).perform();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement btnclick = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	    btnclick.click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    System.out.println(screenshotAs);
	    File f=new File("D:\\Java\\amazon.jpg");
	    FileUtils.copyFile(screenshotAs, f);
		

}
}