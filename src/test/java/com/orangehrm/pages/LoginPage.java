package com.orangehrm.pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {
	
	//username
	
	@FindBy(name="username")
	WebElement usernameTextBox;
	//password
	@FindBy(name="password")
	WebElement passwordTextBox;
	//login button
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	Logger log = LogManager.getLogger(LoginPage.class);
	public void loginToApplication(String userName, String password) {
		
		usernameTextBox.sendKeys(userName);
		log.info("Username is entered in the Username text field(box)!");
		ExtentReportUtils.addStep("Username is entered.");
		
		passwordTextBox.sendKeys(password);
		log.info("Password is entered in the Password text field(box)!");
		ExtentReportUtils.addStep("Password is entered.");
		
		loginBtn.click();
		log.info("Login button is clicked!");
		ExtentReportUtils.addStep("Login button is clicked.");
	}

}
