package org.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement parentFrame = driver.findElement(By.xpath("//div[@id='Multiple']/ iframe"));

		driver.switchTo().frame(parentFrame);

		WebElement innerFrame = driver.findElement(By.xpath("//div[@class='row']/ iframe"));

		driver.switchTo().frame(innerFrame);

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Frame Testing");

	}

}
