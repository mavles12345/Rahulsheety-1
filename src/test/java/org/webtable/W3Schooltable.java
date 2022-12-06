package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schooltable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tableSize=driver.findElements(By.tagName("table"));
		
		System.out.println("Table Size:" +tableSize.size());
		
		WebElement table=driver.findElement(By.id("customers"));
		
	//to get all rows
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		
		// to get each row
		for(int i=0; i<rows.size(); i++) {
			
			WebElement row = rows.get(i);
			
			// to get all headings
			
			List<WebElement> Headings=row.findElements(By.tagName("th"));
			
			
			// to get each heading
			for (int j = 0; j < Headings.size(); j++) {
				
				String heading=Headings.get(j).getText();
				
				System.out.print(heading);
				System.out.print(" ");
				
			}
			
			// to get all datas
			List<WebElement> datas=row.findElements(By.tagName("td"));
			
			// to get each data
			
			for (int j = 0; j < datas.size(); j++) {
				
				String data=datas.get(j).getText();
				
				System.out.println(data);
				//System.out.print(" ");
				
			}
			
		}
		
		
		
		driver.quit();
		
		
		
	}

}
 