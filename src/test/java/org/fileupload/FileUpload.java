package org.fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");

		WebElement upload = driver.findElement(By.id("uploadfile_0"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", upload);

		Runtime.getRuntime().exec("C://Users//Thishiyan.S//Desktop//FileUpload.exe");
		
		Thread.sleep(10000);

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("submitbutton")).click();

	}

}
