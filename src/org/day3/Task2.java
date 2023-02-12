package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mboob\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=17278112553794406600&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=EAIaIQobChMIpfHu9J6g-gIVjjgrCh0lZQXaEAAYASAAEgKHffD_BwE");
	   WebElement txtGet= driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
	   String txt=txtGet.getText();
	   System.out.println(txt);
	   
	  
	}

}
