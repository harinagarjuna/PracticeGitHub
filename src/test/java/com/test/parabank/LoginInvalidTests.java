package com.test.parabank;

import org.testng.Assert;
import com.PageClasses.LoginPage;

public class LoginInvalidTests extends BaseOfTesting{
	//WebDriver driver;
	@org.testng.annotations.Test
	public void invalidLoginTest() {
		
		LoginPage Lpage = new LoginPage(driver);
		Lpage.enterLoginDetails("hari pb", "test");
		String errorMessage = Lpage.getloginErrorMessage();
		Assert.assertEquals(errorMessage, "An internal error has occurred and has been logged.");
		org.testng.Reporter.log("Invalid User and correct Error shown");
	}
	

}
