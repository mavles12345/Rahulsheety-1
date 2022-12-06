package LocatorsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// 1. ID

		driver.findElement(By.id("inputUsername")).sendKeys("selvam");

		// 2. NAME

		driver.findElement(By.name("inputPassword")).sendKeys("12345");

		// 3. ClASS NAME ( submit signInBtn - 2 class name but included one here)

		driver.findElement(By.className("submit")).click();

		// 4. CSS Selector - Parent to child - Need to add space between 2 tags

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		// 5 XPATH - Parent to child - Need to add / between two tags

		driver.findElement(By.xpath("//div/a")).click();

		Thread.sleep(5000);

		// 6. Regular Xpath Expression

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("selvam");

		// 7. Regular CSS Selector Expression

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("12345");

		// 8. Regular Expression by using index in XPATH

		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9841");

		// 9. Regular Expression by using index in CSSSelector

		// driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9841");

		// 10 . CSS Selector - using class attribute with dot (.)

		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		//11. CSS Selector - using ID attribute with #

	}

}
