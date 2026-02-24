package com.test.parabank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseOfTesting {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		return new ChromeDriver();
	}
	@BeforeMethod
	public void setup() {
	driver = getDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}
	
	@AfterMethod
	public void shutDown() {
		if(driver !=null) {
		driver.quit();
		}
	}
	

}
