package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features="F:\\Eclipse-workspace\\RahulshettyAcademy\\src\\test\\java\\org\\features\\SpiceJet.feature",
		
		features="F:\\Eclipse-workspace\\RahulshettyAcademy\\TicketBooking.feature",
		glue="org\\stepdefinition",
		monochrome=true,
		dryRun=false,
		strict=true,
		plugin= {"pretty", "html:html_ouput"}
		
		)
public class RunnerTest {

}
