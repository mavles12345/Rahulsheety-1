package org.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		//Debit Side
		
		WebElement bank=driver.findElement(By.id("credit2"));
		
		WebElement bank1=driver.findElement(By.id("bank"));
		
		a.dragAndDrop(bank, bank1).perform();

		WebElement from = driver.findElement(By.id("fourth"));

		WebElement to = driver.findElement(By.id("amt7"));
		
		a.clickAndHold(from).moveToElement(to).release().perform();

		//a.dragAndDrop(from, to).perform();

	}

}
