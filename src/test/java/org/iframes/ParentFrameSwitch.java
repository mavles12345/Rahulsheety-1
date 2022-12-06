package org.iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentFrameSwitch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		driver.switchTo().frame("iframeResult");

		WebElement innerFrame = driver.findElement(By.xpath("//*[@title='Iframe Example']"));

		//String innerText = driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']"))
			//	.getText();
		
		//System.out.println("Inner Frame Text:" +innerText);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Inner Frame Text:" +driver.findElement(By.xpath("//h1")).getText());

	}
}
