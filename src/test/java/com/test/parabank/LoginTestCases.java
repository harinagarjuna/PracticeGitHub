package com.test.parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageClasses.LoginPage;

public class LoginTestCases extends BaseOfTesting {
	//WebDriver driver = new ChromeDriver();
	
	@Test
	public void validLoginCredentialsTest() {
		LoginPage Lpage = new LoginPage(driver);
		Lpage.enterLoginDetails("hari pb two", "test");
		String dashboardURL = driver.getCurrentUrl();
		Assert.assertEquals(dashboardURL, "https://parabank.parasoft.com/parabank/overview.htm");
	}
	
	
	

}
