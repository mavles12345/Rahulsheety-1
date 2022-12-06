package org.certificate;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCheck {
	
	//chromedriver.chromium.org.capabilities
	
	public static void main(String[] args) throws Throwable {
		
		ChromeOptions option=new ChromeOptions();
		
		option.setAcceptInsecureCerts(true);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		//Block pop-up windows
	
		
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));
		
		//Set download directory
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		
		prefs.put("download.default_directory", "/directory/path");
		
		options.setExperimentalOption("prefs", prefs);
		
		//set proxy
		
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("");
		option.setCapability("proxy", proxy);
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("F:\\Eclipse-workspace\\RahulshettyAcademy\\screenshotimage1\\ssl.png");
		
		FileUtils.copyFile(source, des);
		
		
	}

}
