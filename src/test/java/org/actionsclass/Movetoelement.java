package org.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movetoelement {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));//PIM
		
		WebElement config=driver.findElement(By.id("menu_pim_Configuration"));//Configuration
		
		WebElement dataImport=driver.findElement(By.id("menu_admin_pimCsvImport"));//Data Import
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PIM).moveToElement(config).moveToElement(dataImport).click().perform();// Click data import
		
		
		
	}
	

}
