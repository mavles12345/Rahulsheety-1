package org.calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanldingCalendar {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		driver.findElement(By.xpath("(//a[@value='DEL']) [2]")).click();

		// Selectin desired day (grap common attribute/Put into list and iterate
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

		List<WebElement> allDates = driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

		for (int i = 0; i < allDates.size(); i++) {

			String day = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();

			if (day.equalsIgnoreCase("29")) {

				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}

		}

		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("November")) {

			driver.findElement(By.cssSelector("a[data-handler='next']")).click();

		}
		
		

//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
//
//		driver.findElement(By.id("divpaxinfo")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();

	}

}
