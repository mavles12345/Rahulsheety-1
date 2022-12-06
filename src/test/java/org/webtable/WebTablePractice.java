package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableSize = driver.findElements(By.tagName("table"));
		System.out.println(tableSize.size());

		WebElement table = driver.findElement(By.id("customers"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);

			List<WebElement> headings = row.findElements(By.tagName("th"));

			for (int j = 0; j < headings.size(); j++) {
				String heading = rows.get(j).getText();
				System.out.println(heading);

			}

			List<WebElement> datas = row.findElements(By.tagName("td"));

			for (int j = 0; j < datas.size(); j++) {

				String data = datas.get(j).getText();
				System.out.println(data);

			}

		}

	}
}