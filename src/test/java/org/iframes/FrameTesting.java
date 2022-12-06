package org.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTesting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// Frist frame
		driver.switchTo().frame("packageListFrame");// Name

		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();

		driver.switchTo().defaultContent();

		// Second Frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='packageFrame']")));// WebElement

		driver.findElement(By.xpath("//span[text()='Alert']")).click();

		driver.switchTo().defaultContent();

		// Third Frame
		driver.switchTo().frame(2);

		driver.findElement(By.xpath("(//a[text()='Help'])[2]")).click();

		driver.switchTo().defaultContent();

	}

}
