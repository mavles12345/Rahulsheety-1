package LocatorsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	// WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String name = "selvam";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		getPassword(driver);

		driver.findElement(By.id("inputUsername")).sendKeys("selvam");

		driver.findElement(By.name("inputPassword")).sendKeys("12345");

		driver.findElement(By.className("submit")).click();

		// 12 - LinkText

		// driver.findElement(By.linkText("Forgot your password?")).click();

		// driver.findElement(By.cssSelector("*[placeholder=Name]")).sendKeys(name);

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		String passWord = driver.findElement(By.cssSelector("form p")).getText();

		String[] passwordArr1 = passWord.split("'");
		String password = passwordArr1[1].split("'")[0];

		return password;
	}

}
