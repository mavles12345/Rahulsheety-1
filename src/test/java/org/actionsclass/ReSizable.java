package org.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReSizable {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable/");

		Actions a = new Actions(driver);
		
		driver.switchTo().frame(0);

		WebElement reSize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

		a.moveToElement(reSize).dragAndDropBy(reSize, 80, 50).perform();

		
	}

}
