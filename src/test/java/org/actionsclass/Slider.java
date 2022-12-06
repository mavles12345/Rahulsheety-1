package org.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		Actions a = new Actions(driver);
		
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

		a.moveToElement(slider).dragAndDropBy(slider, 400, 0).perform();

	}

}
