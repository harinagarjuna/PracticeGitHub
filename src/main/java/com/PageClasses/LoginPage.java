package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css ="input[name='username']")
	WebElement userName;
	
	@FindBy(css ="input[name='password']")
	WebElement passWord;
	
	@FindBy(css ="input[type='submit']")
	WebElement LoginButton;
	
	@FindBy(css = "div[id='rightPanel'] p")
	WebElement LoginErrorMessage;
	
	
	public void enterLoginDetails(String uname, String pwd) {
		userName.sendKeys(uname);
		passWord.sendKeys(pwd);
		LoginButton.click();
	}
	
	public String loginErrorMessage() {
		return LoginErrorMessage.getText();
	}
	
	
	
	
	

}
