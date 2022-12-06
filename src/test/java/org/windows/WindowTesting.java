package org.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTesting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		String parentID = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (String windows : allWindows) {

			if (!windows.equals(parentID)) {

				driver.switchTo().window(windows);
			}

		}

//		Iterator<String> windows=allWindows.iterator();
//		
//		String parentID = windows.next();
//		
//		String childID=windows.next();
//		
//		driver.switchTo().window(childID);
//		
		// alternate way

		// }

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];

		System.out.println(username);

		driver.switchTo().window(parentID);

		driver.findElement(By.id("username")).sendKeys(username);

	}

}
