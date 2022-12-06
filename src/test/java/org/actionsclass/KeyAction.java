package org.actionsclass;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyAction {
	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		WebElement from=driver.findElement(By.name("text1"));
		
		WebElement to=driver.findElement(By.name("text2"));
		
		Actions act =new Actions(driver);
		
		from.sendKeys("Testing action class");
		
		//Control A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//Control C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Tab
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//Control V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(from.getAttribute("value").equals(to.getAttribute("value"))) {
			
			System.out.println("Both are equal");
		}
		
		else {
			
			System.out.println("Not equal");
		}
	}

}
