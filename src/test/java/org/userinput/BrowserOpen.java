package org.userinput;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Browser name");

		String browser = sc.nextLine();

		//WebDriver driver = null;
		
		
		
		WebDriver driver=null;

		if (browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");

	}

}
