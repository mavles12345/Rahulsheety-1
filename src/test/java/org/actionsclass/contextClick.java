package org.actionsclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contextClick {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);

		
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span")); 

		act.contextClick(button).perform();

		Robot r = new Robot();

		for (int i = 0; i < 3; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon
		// context-menu-icon-paste']")).click();

		Alert a = driver.switchTo().alert();

		System.out.println(a.getText());

		a.accept();

		driver.quit();

	}

}
