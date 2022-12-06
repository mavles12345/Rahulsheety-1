package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schooldesireddata {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableSize = driver.findElements(By.tagName("table"));

		System.out.println("Table Size:" + tableSize.size());

		WebElement table = driver.findElement(By.id("customers"));

		// to get all rows

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		//to get second row
		String secondRow = rows.get(3).getText();
		System.out.println(secondRow);

		// to get each row
		for (int i = 1; i < rows.size(); i++) {

			WebElement row = rows.get(i);

			List<WebElement> datas = row.findElements(By.tagName("td"));

			//to get second column
			String thirdColumn = datas.get(2).getText();

			System.out.println(thirdColumn);

		}
		
		driver.quit();

	}
}