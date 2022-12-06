package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TicketBooking {

	WebDriver driver;

	@Given("passenger is on the login page")
	public void passenger_is_on_the_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

	}

	@When("Passenger select the one way trip")
	public void passenger_select_the_one_way_trip() {

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	}

	@When("passenger select the departure city and Arrival city")
	public void passenger_select_the_departure_city_and_Arrival_city() {

		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();

		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		driver.findElement(By.xpath("(//a[@value='DEL']) [2]")).click();

	}

	@When("passenger select the date")
	public void passenger_select_the_date() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

	}

	@When("passenger select the number of Adult Child Infant")
	public void passenger_select_the_number_of_Adult_Child_Infant() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("divpaxinfo")).click();

		int i = 1;
		while (i < 5) {

			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		String adultCount = driver.findElement(By.id("divpaxinfo")).getText();

		Assert.assertEquals("5 Adult", adultCount);

		driver.findElement(By.id("btnclosepaxoption")).click();

	}

	@When("Passenger select the currency")
	public void passenger_select_the_currency() {

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select select = new Select(currency);
		select.selectByValue("USD");

	}

	@When("passenger select the country")
	public void passenger_select_the_country() {

		driver.findElement(By.id("autosuggest")).sendKeys("New");

		List<WebElement> listCountry = driver.findElements(By.className("ui-menu-item"));

		for (WebElement country : listCountry)

			if (country.getText().equalsIgnoreCase("New Zealand")) {

				country.click();
				break;
			}

	}

	@When("Passenger select the option to get other benefits")
	public void passenger_select_the_option_to_get_other_benefits() {

		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

	}

	@When("click the Search")
	public void click_the_Search() {

		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();

	}

}
