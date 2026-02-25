package com.test.parabank;

import java.lang.System.Logger;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageClasses.LoginPage;
import com.thoughtworks.qdox.tools.QDoxTester.Reporter;

public class LoginTestCases extends BaseOfTesting {
	//WebDriver driver = new ChromeDriver();
	
	@Test
	public void validLoginCredentialsTest() {
		LoginPage Lpage = new LoginPage(driver);
		Lpage.enterLoginDetails("hari pb two", "test");
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(null))
		String dashboardURL = driver.getCurrentUrl();
		Assert.assertEquals(dashboardURL, "https://parabank.parasoft.com/parabank/overview.htm");
		org.testng.Reporter.log("Successfully logged in - Changed");
	}
	
	
	

}
